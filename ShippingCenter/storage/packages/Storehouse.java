package storage.packages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import storage.users.*;
import storage.transactions.*;


/**
 * Provides functions for working with PackageLists.
 * 
 * @author Rafael Reza
 * @author Cullen Sturdivant
 * 
 * @version 1.1, 10/4/2017
 */
public class Storehouse {
// intro to program

    private static final int TRACKING_NUM_LENGTH = 5;

    public static void main(String[] args) {

        PackageList storehouse = new PackageList();
        UserList users = new UserList();
        TransactionHistory history = new TransactionHistory();
        
        boolean exit;
        boolean inMenu;
        int input = 0;
        Scanner userInput = new Scanner(System.in);

        exit = false;

        while (!exit) {

            System.out.println("1.  Show all existing package records.");
            System.out.println("2.  Add new package record to the database.");
            System.out.println("3.  Delete package record from database.");
            System.out.println("4.  Search for a package (given its tracking number).");
            System.out.println("5.  Show a list of users in the database.");
            System.out.println("6.  Add new user to the database.");
            System.out.println("7.  Update user info (given their ID).");
            System.out.println("8.  Complete a shipping transaction.");
            System.out.println("9.  Show completed shipping transaction.");
            System.out.println("10. Exit program.");

            inMenu = true;

            while (inMenu) {
                if (userInput.hasNextInt()) {
                    input = userInput.nextInt();

                    if (input >= 1 && input <= 10) {
                        inMenu = false;
                    }
                    else {
                        System.out.println(input + " is not a menu option");
                    }
                }
                else {
                    String badInput = userInput.nextLine();
                    System.out.println(badInput + " is not a menu option");
                }
            }
            
            switch (input) {
                
                case 1:  storehouse.showAll();
                         break;
                         
                case 2:  Package pack = addPackagePrompt();
                         storehouse.addPackage(pack);
                         break;
                         
                case 3:  String tn = deletePrompt();
                         storehouse.deletePackage(tn);
                         break;
                         
                case 4:  String track = searchPrompt();
                         storehouse.searchPackages(track);
                         break;
                         
                case 5:  users.showAll();
                         break;
                         
                case 6:  User newUser = addUserPrompt();
                         users.addUser(newUser);
                
                case 7:  
                
                case 8:  
                
                case 9:  
                         
                case 10: exit = true;
            }
        }
    }
    
    /**
     * Verifies if the supplied tracking number is of a given length.
     * 
     * @param trackingNum the tracking number to be verified.
     * @param length the desired length of the tracking number.
     * 
     * @return True if tracking number length matches <b>length</b>
     * and false otherwise.
     */
    private static boolean verifyTrackingNumber(String trackingNum, int length) {
        if (trackingNum.length() == length) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Verifies if the supplied string matches an appropriate package type.
     * 
     * @param the string to be verified.
     * 
     * @return True if there is a match, false otherwise.
     */
    private static boolean verifyType(String type) {
        for (Type t : Type.values()) {
            if (type.equalsIgnoreCase(t.getValue())) {
                return true;
            }
        }
        return false;
    }
    /**
     * Verifies if the supplied string matches an appropriate specification.
     * 
     * @param the string to be verified.
     * 
     * @return True if there is a match, false otherwise.
     */
    private static boolean verifySpecification(String spec) {
        for (Specification specify : Specification.values()) {
            if (spec.equalsIgnoreCase(specify.getValue())) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Verifies if the supplied string matches an appropriate mailing class.
     * 
     * @param the string to be verified.
     * 
     * @return True if there is a match, false otherwise.
     */
    private static boolean verifyMailingClass(String mc) {
        for (MailingClass mailClass : MailingClass.values()) {
            if (mc.equalsIgnoreCase(mailClass.getValue())) {
                return true;
            }
        }
        return false;
    }
    
    private static User addUserPrompt() {
        String firstName = null;
        String lastName = null;
        String CorE = null;
        
        boolean success = false;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the new user's first name:");
        
        firstName = sc.nextLine();
        
        System.out.println("Enter the new user's last name:");
        
        lastName = sc.nextLine();
        
        while (!success) {
            System.out.println("Customer or Employee?");
            
            CorE = sc.nextLine();
            if (CorE.equals("Customer") || CorE.equals("Employee")) {
                success = true;
            }
            else {
                System.out.println("That is not a valid option.");
            }
        }
        
        if (CorE.equals("Customer")) {
            String pn = null;
            String address = null;
            
            System.out.println("Enter your phone number:");
            pn = sc.nextLine();
            
            System.out.println("Enter your address:");
            address = sc.nextLine();
            
            return new Customer(firstName, lastName, pn, address);
        }
        else {
            int ssn = 0;
            float salary = 0f;
            int ban = 0;
            
            success = false;
            
            while (!success) {
                System.out.println("Enter the employee's Social Security Number:");
                
                if(sc.hasNextInt()) {
                    ssn = sc.nextInt();
                    if (String.valueOf(ssn).length() != 9) {
                        System.out.println("That is not an SSN");
                        sc.nextLine();
                    }
                    else {
                        success = true;
                    }
                }
                else {
                    System.out.println("That is not an SSN");
                    sc.nextLine();
                }
            }
            
            success = false;
            while (!success) {
                System.out.println("Enter the monthly salary of the employee:");
                
                if (sc.hasNextFloat()) {
                    salary = sc.nextFloat();
                    if (salary <= 0f) {
                        System.out.println("Salary cannot be negative or zero");
                        sc.nextLine();
                    }
                    else {
                        success = true;
                    }
                }
                else {
                    System.out.println("This is not a valid input.");
                    sc.nextLine();
                }
            }
            
            success = false;
            while (!success) {
                System.out.println("Enter the employee's Bank Account Number:");
                
                if(sc.hasNextInt()) {
                    ban = sc.nextInt();
                    if (String.valueOf(ban).length() != 10) {
                        System.out.println("That is not an BAN");
                        sc.nextLine();
                    }
                    else {
                        success = true;
                    }
                }
                else {
                    System.out.println("That is not an BAN");
                    sc.nextLine();
                }
            }
            return new Employee(firstName, lastName, ssn, salary, ban);
        }
        
        
    }
    
    /**
     * Prompts the user for all fields required to create a new package.
     * 
     * @return Returns the package that was created.
     */
    private static Package addPackagePrompt() {
        
        String tn = null;
        String type = null;
        String spec = null;
        String mc = null;
        
        boolean success = false;
        
        Scanner sc = new Scanner(System.in);
        
        while (!success) {
            System.out.println("Enter the type of package (Envelope, Box, Crate, Drum, None):");
            
            type = sc.nextLine();
            if (!verifyType(type)) {
                System.out.println("That is not a valid type.");
            }
            else {
                success = true;
            }
        }
        
        success = false;
        while (!success) {
            System.out.println("Enter the tracking number:");
            
            tn = sc.nextLine();
            if (!verifyTrackingNumber(tn, TRACKING_NUM_LENGTH)) {
                System.out.println("That is not a valid tracking number.");
            }
            else {
                success = true;
            }
        }
        
        success = false;
        while (!success) {
            System.out.println("Enter the specification (Fragile, Books, Catalogs, Do-not-Bend, n/a):");
            
            spec = sc.nextLine();
            if (!verifySpecification(spec)) {
                System.out.println("That is not a valid specification.");
            }
            else {
                success = true;
            }
        }
        
        success = false;
        while (!success) {
            System.out.println("Enter the mailing class of the package (First, Priority, Retail, Ground, Metro):");
            
            mc = sc.nextLine();
            if (!verifyMailingClass(mc)) {
                System.out.println("That is not a valid mailing class.");
            }
            else {
                success = true;
            }
        }
        
        
        
        if (type.equalsIgnoreCase("Envelope")) {
            int height = 0;
            int width = 0;
            
            success = false;
            while (!success) {
                System.out.println("Enter the height (in inches) of the envelope:");
                
                if (sc.hasNextInt()) {
                    height = sc.nextInt();
                    if (height <= 0) {
                        System.out.println("Height cannot be negative or zero.");
                    }
                    else {
                        success = true;
                    }
                }
                else {
                    System.out.println("That is not whole number.");
                    sc.nextLine();      // clear buffer
                }
            }
            
            success = false;
            while (!success) {
                System.out.println("Enter the width (in inches) of the envelope:");
                
                if (sc.hasNextInt()) {
                    width = sc.nextInt();
                    if (width <= 0) {
                        System.out.println("Width cannot be negative or zero.");
                    }
                    else {
                        success = true;
                    }
                }
                else {
                    System.out.println("That is not whole number.");
                    sc.nextLine();      // clear buffer
                }
            }
            
            return new Envelope(tn, spec, mc, height, width);
        }
        else if (type.equalsIgnoreCase("Box")) {
            int largestDim = 0;
            int volume = 0;
            
            success = false;
            while (!success) {
                System.out.println("Enter the largest dimension (in inches) of the box:");
                
                if (sc.hasNextInt()) {
                    largestDim = sc.nextInt();
                    if (largestDim <= 0) {
                        System.out.println("Largest dimension cannot be negative or zero.");
                    }
                    else {
                        success = true;
                    }
                }
                else {
                    System.out.println("That is not whole number.");
                    sc.nextLine();      // clear buffer
                }
            }
            
            success = false;
            while (!success) {
                System.out.println("Enter the volume (in cubic inches) of the box:");
                
                if (sc.hasNextInt()) {
                    volume = sc.nextInt();
                    if (volume <= 0) {
                        System.out.println("Volume cannot be negative or zero.");
                    }
                    else {
                        success = true;
                    }
                }
                else {
                    System.out.println("That is not whole number.");
                    sc.nextLine();      // clear buffer
                }
            }
            
            return new Box(tn, spec, mc, largestDim, volume);
        }
        else if (type.equalsIgnoreCase("Crate")) {
            float maxLoadWeight = 0f;
            String content = null;
            
            success = false;
            while (!success) {
                System.out.println("Enter the maximum load weight (in pounds) of the crate:");
                
                if (sc.hasNextFloat()) {
                    maxLoadWeight = sc.nextFloat();
                    if (maxLoadWeight <= 0) {
                        System.out.println("Load weight cannot be negative or zero.");
                    }
                    else {
                        success = true;
                    }
                }
                else {
                    System.out.println("That is not number.");
                    sc.nextLine();      // clear buffer
                }
            }
            sc.nextLine();
            
            System.out.println("Enter the contents of the crate:");
            
            content = sc.nextLine();
            
            return new Crate(tn, spec, mc, maxLoadWeight, content);
        }
        else if (type.equalsIgnoreCase("Drum")) {
            String material = null;
            int diameter = 0;
            
            success = false;
            while (!success) {
                System.out.println("Enter the material of the drum (Plastic, Fiber):");
                
                material = sc.nextLine();
                if (material.equals("Plastic") || material.equals("Fiber")) {
                    success = true;
                }
                else {
                    System.out.println("That is not a valid material");
                }
            }
            
            success = false;
            while (!success) {
                System.out.println("Enter the diameter (in inches) of the drum:");
                
                if (sc.hasNextInt()) {
                    diameter = sc.nextInt();
                    if (diameter <= 0) {
                        System.out.println("Diameter cannot be negative or zero.");
                    }
                    else {
                        success = true;
                    }
                }
                else {
                    System.out.println("That is not a whole number");
                    sc.nextLine();
                }
            }
            
            return new Drum(tn, spec, mc, material, diameter);
        }
        else {
            return new Package(tn, spec, mc);
        }
    }
    
    /**
     * Prompts the user to provide a tracking number for deletion
     * in a PackageList.
     * 
     * @return the verified tracking number.
     */
    private static String deletePrompt() {
        boolean success = false;
        String tn = null;
        Scanner sc = new Scanner(System.in);
        
        while (!success) {
            
            System.out.println("Enter the tracking number of the package you want to delete:");
            
            tn = sc.nextLine();
            if (!verifyTrackingNumber(tn, 5)) {
                
            }
            else {
                return tn;
            }
        }
        return null;
    }
    
    /**
     * Prompts the user to enter the tracking number to find a package
     * in a PackageList.
     * 
     * @return the verified tracking number.
     */
    private static String searchPrompt() {
        boolean success = false;
        String tn = null;
        Scanner sc = new Scanner(System.in);
        
        while (!success) {
            
            System.out.println("Enter the tracking number of the package you want to search for:");
            
            tn = sc.nextLine();
            if (!verifyTrackingNumber(tn, 5)) {
                System.out.println("Please enter a valid tracking number.");
            }
            else {
                return tn;
            }
        }
        return null;
    }   
    
    /**
     * Prepares the program to exit by saving a PackageList to a file.
     * 
     * @param the PackageList to be saved to a file.
     */
    private static void exit(PackageList packages) {
        
    }
}

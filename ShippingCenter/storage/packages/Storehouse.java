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
                case 3:
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
        float w = 0f;
        int v = 0;
        
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
        
        if (type.equalsIgnoreCase("Envelope")) {
            
        }
        
        return new Package();
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
            
            System.out.println("Enter the tracking number of the package you want to delete:");
            
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

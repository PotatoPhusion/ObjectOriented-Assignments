package storage.packages;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
// intro to program

    private static final int TRACKING_NUM_LENGTH = 5;

    public static void main(String[] args) {

        PackageList parcels = new PackageList(1);
        boolean exit;
        boolean inMenu;
        int input = 0;
        Scanner userInput = new Scanner(System.in);


        // *********************************
        // Set up the file Reader
        // *********************************
        FileReader fr;
        Scanner inFile = null;

        try {
            fr = new FileReader("packages.txt");
            inFile = new Scanner(fr);
            
            // *********************************
            // Read packages in from file
            // *********************************
            while (inFile.hasNextLine()) {
                
                boolean failFlag = false;
                
                String tempTN = inFile.next();
                
                if (!verifyTrackingNumber(tempTN, TRACKING_NUM_LENGTH)) {
                    System.out.println("Found invalid tracking number. Skipping package.");
                    
                    inFile.nextLine();
                    failFlag = true;
                }
                
                if (!failFlag) {
                    String tempType = inFile.next();
                
                    if (!verifyType(tempType)) {
                        
                    }
                }
                
                if (!failFlag) {
                    String tempSpec = inFile.next();
                    
                    if (!verifySpecification(tempSpec)) {
                        
                    }
                }
                
                if (!failFlag) {
                    String tempMC = inFile.next();
                    
                    if (!verifyMailingClass(tempMC)) {
                        
                    }
                }
                
                if (!failFlag) {
                    if (inFile.hasNextDouble()) {
                        float tempWeight = (float)inFile.nextDouble();
                    }
                }
                
                if (!failFlag) {
                    if (inFile.hasNextInt()) {
                        int tempVolume = inFile.nextInt();
                        
                        inFile.nextLine(); // nextInt does not read new line characters
                    }
                }
            }
        }
        catch (FileNotFoundException ex) {
            System.err.println("The file could not be accessed");
        }
        catch (Exception e) {
            System.err.println("An unknown error occurred");
            e.printStackTrace();
        }
            
        










        exit = false;

        while (!exit) {

            System.out.println("1. Show all existing package records.");
            System.out.println("2. Add new package record to the database.");
            System.out.println("3. Delete package record from database.");
            System.out.println("4. Search for a package (given its tracking number).");
            System.out.println("5. Show a list of packages within a given weight range.");
            System.out.println("6. Exit program.");

            inMenu = true;

            while (inMenu) {
                if (userInput.hasNextInt()) {
                    input = userInput.nextInt();

                    if (input >= 1 && input <= 6) {
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
            case (1):
                parcels.showAll();
                break;
            case (2):
                parcels.addPackage(new Package());
                break;
            case (3):
                parcels.deletePackage(new Package());   
                break;
            case (4):
                parcels.searchPackages(new Package());
                break;
            case (5):
                parcels.showByWeightRange(0f, 1f);
                break;
            default:
                exit();
                break;
            }
        }
        inFile.close(); //Close file
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
    
    private static boolean verifyType(String type) {
        return true;
    }
    
    private static boolean verifySpecification(String spec) {
        return true;
    }
    
    private static boolean verifyMailingClass(String mc) {
        return true;
    }
    
    private static void exit() {
        
    }
   
}

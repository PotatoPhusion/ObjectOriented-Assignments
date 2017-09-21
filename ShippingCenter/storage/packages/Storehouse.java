package storage.packages;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Storehouse {
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
            while (inFile.hasNext()) {
                
                boolean failFlag = false;
                
                String tempTN;
                String tempType = null;
                String tempSpec = null;
                String tempMC = null;
                float tempWeight = 0f;
                int tempVolume = 0;
                
                tempTN = inFile.next();
                
                if (!verifyTrackingNumber(tempTN, TRACKING_NUM_LENGTH)) {
                    System.out.println("Found invalid tracking number. Skipping package.");
                    
                    inFile.nextLine();
                    failFlag = true;
                }
                
                if (!failFlag) {
                    tempType = inFile.next();
                
                    if (!verifyType(tempType)) {
                        System.out.println("Found invalid type. Skipping package.");
                        
                        inFile.nextLine();
                        failFlag = true;
                    }
                }
                
                if (!failFlag) {
                    tempSpec = inFile.next();
                    
                    if (!verifySpecification(tempSpec)) {
                        System.out.println("Found invalid specification. Skipping package.");
                        
                        inFile.nextLine();
                        failFlag = true;
                    }
                }
                
                if (!failFlag) {
                    tempMC = inFile.next();
                    
                    if (!verifyMailingClass(tempMC)) {
                        System.out.println("Found invalid mailing class. Skipping package.");
                        
                        inFile.nextLine();
                        failFlag = true;
                    }
                }
                
                if (!failFlag) {
                    if (inFile.hasNextDouble()) {
                        tempWeight = (float)inFile.nextDouble();
                    }
                    else {
                        System.out.println("Found invalid weight. Skipping package.");
                        
                        inFile.nextLine();
                        failFlag = true;
                    }
                }
                
                if (!failFlag) {
                    if (inFile.hasNextInt()) {
                        tempVolume = inFile.nextInt();
                        
                        inFile.next(); // nextInt does not read new line characters
                    }
                    else {
                        System.out.println("Found invalid volume. Skipping package.");
                        
                        inFile.next();
                        failFlag = true;
                    }
                }
                
                if (!failFlag) {
                    Package pack = new Package(tempTN, tempType, tempSpec,
                                               tempMC, tempWeight, tempVolume);
                    
                    parcels.addPackage(pack);
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
            
            //System.out.println(Type.values()[2].getValue());

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
                Package p = addPackagePrompt();
                parcels.addPackage(p);
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
        for (Type t : Type.values()) {
            if (type.equals(t.getValue())) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean verifySpecification(String spec) {
        return true;
    }
    
    private static boolean verifyMailingClass(String mc) {
        for (MailingClass mc : MailingClass.values()) {
            if (type.equals(mc.getValue())) {
                return true;
            }
        }
        return false;
    }
    
    private static Package addPackagePrompt() {
        
        String tn = null;
        String type = null;
        String spec = null;
        String mc = null;
        float w = 0f;
        int v = 0;
        
        boolean success = false;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the tracking number of the package:");
        while (!success) {
            tn = sc.nextLine();
            if (!verifyTrackingNumber(tn, TRACKING_NUM_LENGTH)) {
                System.out.println("That is not a valid tracking number.");
                System.out.println("Enter the tracking number of the package:");
            }
            else {
                success = true;
            }
        }
        
        success = false;
        while (!success) {
            System.out.println("Enter the type of package (Postcard, Letter," +
                               " Envelope, Packet, Box, Crate, Drum, Roll, Tube)");
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
            System.out.println("Enter the specification of the package " +
                               "(Fragile, Books, Catalogs, Do-Not-Bend, N/A):");
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
            System.out.println("Enter the mailing class of the package " +
                               "First Class, Priority, Retail, Ground, Metro:");
            mc = sc.nextLine();
            if (!verifyMailingClass(mc)) {
                System.out.println("That is not a valid mailing class.");
            }
            else {
                success = true;
            }
        }
        
        success = false;
        while (!success) {
            System.out.println("Enter the weight of the package:");
            
            if (!sc.hasNextDouble()) {
                System.out.println("That is not a valid weight.");
                sc.nextLine();
            }
            else {
                w = (float)sc.nextDouble();
                success = true;
            }
        }
        
        success = false;
        while (!success) {
            System.out.println("Enter the volume of the package:");
            
            if (!sc.hasNextInt()) {
                System.out.println("That is not a valid volume");
                sc.nextLine();
            }
            else {
                v = sc.nextInt();
                success = true;
            }
        }
        return new Package(tn, type, spec, mc, w, v);
    }
        
    
    private static void exit() {
        
    }
   
}

/**
 * @author Cullen Sturdivant
 * @version 1.0, 09/19/2017
 */

package storage.packages;

import java.util.Scanner;
import java.util.ArrayList;
import storage.packages.Package;

public class PackageList {

    private final String line = "--------------------------------------------" +
                                "---------------------------------";
    private final String header = "| TRACKING # |   TYPE   | SPECIFICATION | " +
                                  "   CLASS    |   WEIGHT   | VOLUME |";
    private final String divider = " | ";

    private static ArrayList<Package> packages;

    /**
     * Generates a new PackageList.
     */
    PackageList() {
        packages = new ArrayList<Package>();
    }

    /**
     * Generates a new PackageList with a given size.
     * 
     * @param size the initial size of the package list.
     */
    PackageList(int size) {
        packages = new ArrayList<Package>(size);
    }
    
    /**
     * Shows all of the packages in the current PackageList.
     */
    public void showAll() {
        System.out.println(line);
        System.out.println(header);
        System.out.println(line);

        for (Package pack : packages) {
            System.out.printf("| %10s" + divider, pack.getTrackingNumber());
            System.out.printf("%13s" + divider, pack.getSpecification());
            System.out.printf("%11s" + " |", pack.getMailingClass());
        }

        System.out.println(line);
    }
    
    /**
     * Accessor for the length of the PackageList.
     * 
     * @return the length of the PackageList
     */
    public int length() {
        return packages.size();
    }
    
    /**
     * Find the value at any given index.
     * 
     * @return the Package object at that index.
     */
    public static Package get(int index) {
        return packages.get(index);
    }

    /**
     * Adds a package to the PackageList.
     * 
     * @param Pack is the package to be added to the list.
     */
    public void addPackage(Package pack) {
        packages.add(pack);
    }

    /**
     * Deletes a package from the PackageList based on its tracking number.
     * 
     * @param trackingNum the tracking number of the package you
     * want to delete.
     */
    public boolean deletePackage(String trackingNum) {
        for (Package pack : packages) {
            if (pack.getTrackingNumber().equals(trackingNum)) {
                packages.remove(pack);
                return true;
            }
        }
        return false;
    }

    public boolean deletePackage(Package pack) {
        //packages.remove(pack);
        return false;
    }

    /**
     * Searches for a package based on its tracking number.
     *
     * @param trackingNum the tracking number you want to search by.
     * 
     * @return The index of the corresponding package if found or -1 if not found.
     */
    public int searchPackages(String trackingNum) {
        int i = 0;
        for (Package pack : packages) {
            if (pack.getTrackingNumber().equalsIgnoreCase(trackingNum)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int searchPackages(Package pack) {
        return -1;
    }

    /**
     * Shows all packages within a given weight range.
     * 
     * @param min the lower bound of package weights.
     * @param max the upper bound of package weights.
     */
    /*
    public void showByWeightRange(float min, float max) {
        System.out.println(line);
        System.out.println(header);
        System.out.println(line);

        for (Package pack : packages) {
            if (pack.getWeight() >= min && pack.getWeight() <= max){
                System.out.printf("| %10s" + divider, pack.getTrackingNumber());
                System.out.printf("%13s" + divider, pack.getSpecification());
                System.out.printf("%11s" + divider, pack.getMailingClass());
            }
        }

        System.out.println(line);
    }
    */
    /**
     * Shows all packages within a given weight range.
     * 
     * @param min the lower bound of package weights.
     * @param max the upper bound of package weights.
     */
    /*
    public void showByWeightRange(double min, double max) {
        System.out.println(line);
        System.out.println(header);
        System.out.println(line);

        for (Package pack : packages) {
            if (pack.getWeight() >= (float)min && pack.getWeight() <= (float)max){
                System.out.printf("| %10s" + divider, pack.getTrackingNumber());
                System.out.printf("%8s" + divider, pack.getType());
                System.out.printf("%13s" + divider, pack.getSpecification());
                System.out.printf("%11s" + divider, pack.getMailingClass());
                System.out.printf("%10.02f" + divider, pack.getWeight());
                System.out.printf("%6d" + " |%n", pack.getVolume());
            }
        }

        System.out.println(line);
    }
    */
}

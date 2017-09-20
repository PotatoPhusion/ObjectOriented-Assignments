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

    private ArrayList<Package> packages;

    PackageList() {
        packages = new ArrayList<Package>();
    }

    PackageList(int size) {
        packages = new ArrayList<Package>(size);
    }

    public void showAll() {
        System.out.println(line);
        System.out.println(header);
        System.out.println(line);

        for (Package pack : packages) {
            System.out.printf("| %10s" + divider, pack.getTrackingNumber());
            System.out.printf("%8s" + divider, pack.getType());
            System.out.printf("%13s" + divider, pack.getSpecification());
            System.out.printf("%11s" + divider, pack.getMailingClass());
            System.out.printf("%10.02f" + divider, pack.getWeight());
            System.out.printf("%6d" + " |%n", pack.getVolume());
        }

        System.out.println(line);
    }

    public void addPackage(Package pack) {
        packages.add(pack);
    }

    public void deletePackage(String trackingNum) {
        //packages.remove(pack);
    }

    public void deletePackage(Package pack) {
        packages.remove(pack);
    }

    /**
     * Searches for a package based on its tracking number.
     *
     * @param trackingNum The tracking number you want to search by.
     * @return The corresponding package if found or a new null Package if
     * not found.
     */
    public Package searchPackages(String trackingNum) {
        for (Package pack : packages) {
            if (pack.getTrackingNumber().equals(trackingNum)) {
                return pack;
            }
        }
        return new Package();
    }

    public void searchPackages(Package pack) {

    }

    public void showByWeightRange(float min, float max) {
        System.out.println(line);
        System.out.println(header);
        System.out.println(line);

        for (Package pack : packages) {
            if (pack.getWeight() >= min && pack.getWeight() <= max){
                System.out.printf("| %10s" + divider, pack.getTrackingNumber());
                System.out.printf("%4s" + divider, pack.getType());
                System.out.printf("%13s" + divider, pack.getSpecification());
                System.out.printf("%11s" + divider, pack.getMailingClass());
                System.out.printf("%10.02f" + divider, pack.getWeight());
                System.out.printf("%6d" + " |%n", pack.getVolume());
            }
        }

        System.out.println(line);
    }
}

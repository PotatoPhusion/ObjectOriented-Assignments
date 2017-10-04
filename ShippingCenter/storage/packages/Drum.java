package storage.packages;


/**
 * A package of type Drum.
 *
 * @author Cullen Sturdivant
 * @version 1.0, 10/1/2017
 */
public class Drum extends Package {
    
    private final String divider = " | ";
    private final String packageType = "Drum";
    
    private final String material;
    private final int diameter;
    
    public Drum(String trackingNumber, String specification, String mailingClass,
                String material, int diameter) {
        super(trackingNumber, specification, mailingClass);
        this.material = material;
        this.diameter = diameter;
    }
    
    public String getMaterial() {
        return this.material;
    }
    
    public int getDiameter() {
        return this.diameter;
    }
    
    public void print() {
        System.out.printf("| %8s" + divider, this.packageType);
        super.printForPackageType();
        System.out.printf("%10s" + divider, " ");
        System.out.printf("%7s" + divider, " ");
        System.out.printf("%17s" + divider, " ");
        System.out.printf("%10s" + divider, " ");
        System.out.printf("%15s" + divider, " ");
        System.out.printf("%17s" + divider, " ");
        System.out.printf("%8s" + divider, material);
        System.out.printf("%8d |%n", diameter);
    }
}

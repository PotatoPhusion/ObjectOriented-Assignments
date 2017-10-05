package storage.packages;


/**
 * A package of type Envelope.
 *
 * @author Cullen Sturdivant
 * @version 1.0, 10/1/2017
 */
public class Envelope extends Package {
    
    private final String divider = " | ";
    private final String packageType = "Envelope";
    
    private final int height;
    private final int width;
    
    /**
     * Constructor for objects of class Envelope.
     * 
     * @param height the height of the envelope.
     * @param width the width of the envelope.
     */
    public Envelope(String trackingNumber, String specification, String mailingClass,
                    int height, int width) {
        super(trackingNumber, specification, mailingClass);
        this.height = height;
        this.width = width;
    }
    
    /**
     * Accessor for the <code>height</code> field.
     * 
     * @return the height of the envelope.
     */
    public int getHeight() {
        return this.height;
    }
    
    /**
     * Accessor for the <code>width</code> field.
     * 
     * @return the width of the envelope.
     */
    public int getWidth() {
        return this.width;
    }
    
    /**
     * Prints out the Envelope object
     */
    public void print() {
        System.out.printf("| %8s" + divider, this.packageType);
        super.printForPackageType();
        System.out.printf("%10d" + divider, this.height);
        System.out.printf("%7d" + divider, this.width);
        System.out.printf("%17s" + divider, " ");
        System.out.printf("%10s" + divider, " ");
        System.out.printf("%15s" + divider, " ");
        System.out.printf("%17s" + divider, " ");
        System.out.printf("%8s" + divider, " ");
        System.out.printf("%8s |%n", " ");
    }
}

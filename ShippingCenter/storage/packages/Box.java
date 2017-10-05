package storage.packages;


/**
 * A package of type Box.
 *
 * @author Rafael Reza
 * @version 1.0, 10/1/2017
 */
public class Box extends Package {
    
    private final String divider = " | ";
    private final String packageType = "Box";
    
    private final int largestDim;
    private final int volume;
    
    /**
     * Constructor for objects of class Box.
     * 
     * @param largestDim, largest dimension of the Box
     * @param volume of the Box
     */
    public Box(String trackingNumber, String specification, String mailingClass,
               int largestDim, int volume) {
        super(trackingNumber, specification, mailingClass);
        this.largestDim = largestDim;
        this.volume = volume;
    }
    
    /**
     * Accessor for the largestDim field.
     * 
     * @return the largestDim of the Box.
     */
    public int getLargestDimension() {
        return this.largestDim;
    }
    
    /**
     * Accessor for the volume field.
     * 
     * @return the volume of the Box.
     */
    public int getVolume() {
        return this.volume;
    }
    
    /**
     * Prints out the Box object
     */
    public void print() {
        System.out.printf("| %8s" + divider, this.packageType);
        super.printForPackageType();
        System.out.printf("%10s" + divider, " ");
        System.out.printf("%7s" + divider, " ");
        System.out.printf("%17d" + divider, largestDim);
        System.out.printf("%10d" + divider, volume);
        System.out.printf("%15s" + divider, " ");
        System.out.printf("%17s" + divider, " ");
        System.out.printf("%8s" + divider, " ");
        System.out.printf("%8s |%n", " ");
    }
}

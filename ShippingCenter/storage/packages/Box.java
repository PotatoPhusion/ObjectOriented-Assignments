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
    
    public Box(String trackingNumber, String specification, String mailingClass,
               int largestDim, int volume) {
        super(trackingNumber, specification, mailingClass);
        this.largestDim = largestDim;
        this.volume = volume;
    }
    
    public int getLargestDimension() {
        return this.largestDim;
    }
    
    public int getVolume() {
        return this.volume;
    }
    
    public void print() {
        System.out.printf("| %8s" + divider, this.packageType);
        super.print();
        System.out.printf("%10s" + divider, " ");
        System.out.printf("%7s" + divider, " ");
        System.out.printf("%17d" + divider, largestDim);
        System.out.printf("%10d" + divider, volume);
        System.out.printf("%15s" + divider, " ");
        System.out.printf("%13s" + divider, " ");
        System.out.printf("%8s" + divider, " ");
        System.out.printf("%8 |%n", " ");
    }
}

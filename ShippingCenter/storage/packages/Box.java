package storage.packages;


/**
 * A package of type Box.
 *
 * @author Rafael Reza
 * @version 1.0, 10/1/2017
 */
public class Box extends Package {
    
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
}

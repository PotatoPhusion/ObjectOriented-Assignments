package storage.packages;


/**
 * A package of type Box.
 *
 * @author Rafael Reza
 * @version 1.0, 10/1/2017
 */
public class Box extends Package {
    
    private int largestDim;
    private int volume;
    
    public Box() {
        largestDim = 0;
        volume = 0;
    }
    
    public Box(int largestDim, int volume) {
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

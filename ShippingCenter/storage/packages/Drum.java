package storage.packages;


/**
 * A package of type Drum.
 *
 * @author Cullen Sturdivant
 * @version 1.0, 10/1/2017
 */
public class Drum extends Package {
    
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
}

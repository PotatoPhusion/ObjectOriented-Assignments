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
    
    /**
     * Constructor for objects of class Drum
     * 
     * @param material of the package
     * @param diameter of the package
     */
    public Drum(String trackingNumber, String specification, String mailingClass,
                String material, int diameter) {
        super(trackingNumber, specification, mailingClass);
        this.material = material;
        this.diameter = diameter;
    }
    
    /**
     * Accesor for the material
     * 
     * @return the material
     */
    public String getMaterial() {
        return this.material;
    }
    
    /**
     * Accesor for the diameter
     * 
     * @return the diameter of the Drum
     */
    public int getDiameter() {
        return this.diameter;
    }
}

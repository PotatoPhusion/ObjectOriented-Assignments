package storage.packages;


/**
 * A package of type Drum.
 *
 * @author Cullen Sturdivant
 * @version 1.0, 10/1/2017
 */
public class Drum extends Package {
    
    private String material;
    private int diameter;
    
    public Drum() {
        this.material = null;
        this.diameter = 0;
    }
    
    public Drum(String material, int diameter) {
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

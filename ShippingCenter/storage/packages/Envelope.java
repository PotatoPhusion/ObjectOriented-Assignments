package storage.packages;


/**
 * A package of type Envelope.
 *
 * @author Cullen Sturdivant
 * @version 1.0, 10/1/2017
 */
public class Envelope extends Package {
    
    private int height;
    private int width;
    
    /**
     * Constructor for objects of class Envelope.
     */
    public Envelope()
    {
        this.height = 0;
        this.width = 0;
    }
    
    /**
     * Constructor for objects of class Envelope.
     * 
     * @param height the height of the envelope.
     * @param width the width of the envelope.
     */
    public Envelope(int height, int width) {
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
}

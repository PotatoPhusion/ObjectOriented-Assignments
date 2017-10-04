package storage.packages;


/**
 * A package of type Crate.
 *
 * @author Cullen Sturdivant
 * @version 1.0 10/1/2017
 */
public class Crate extends Package {

    private final float maxLoadWeight;
    private final String content;
    
    /**
     * Accessor for the objects of class Crate
     * 
     * @param maxLoadWeight, maximum load weight of Crate
     * @param content, contents of the Crate
     */
    public Crate(String trackingNumber, String specification, String mailingClass,
                 float maxLoad, String content) {
        super(trackingNumber, specification, mailingClass);
        this.maxLoadWeight = maxLoad;
        this.content = content;
    }
    
    /**
     * Accessor for the maxLoadWeight field.
     * 
     * @return the maxLoadWeight
     */
    public float getMaxLoadWeight() {
        return this.maxLoadWeight;
    }
    
    /**
     * Accessor for the content field. 
     * 
     * @return the contents of the Crate.
     */
    public String getContent() {
        return this.content;
    }
    
}

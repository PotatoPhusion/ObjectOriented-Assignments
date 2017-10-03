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
    
    public Crate(String trackingNumber, String specification, String mailingClass,
                 float maxLoad, String content) {
        super(trackingNumber, specification, mailingClass);
        this.maxLoadWeight = maxLoad;
        this.content = content;
    }
    
    public float getMaxLoadWeight() {
        return this.maxLoadWeight;
    }
    
    public String getContent() {
        return this.content;
    }
    
}

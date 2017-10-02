package storage.packages;


/**
 * A package of type Crate.
 *
 * @author Cullen Sturdivant
 * @version 1.0 10/1/2017
 */
public class Crate extends Package {

    private float maxLoadWeight;
    private String content;
    
    public Crate() {
        this.maxLoadWeight = 0f;
        this.content = "Empty";
    }
    
    public Crate(float maxLoad, String content) {
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

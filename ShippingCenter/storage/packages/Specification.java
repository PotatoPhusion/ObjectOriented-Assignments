package storage.packages;


/**
 * The specifications for a package.
 *
 * @author Cullen Sturdivant
 * @version 1.0, 9/20/2017
 */
public enum Specification {
    
    FRAGILE ("Fragile"),
    BOOKS ("Books"),
    CATALOGS ("Catalogs"),
    DO_NOT_BEND ("Do-Not-Bend"),
    N_A ("N/A");
    
    private String spec;
    
    Specification(String spec) {
        this.spec = spec;
    }
    
    public String getValue() {
        return this.spec;
    }
}

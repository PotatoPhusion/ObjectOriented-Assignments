package storage.packages;


/**
 * A package of type Crate.
 *
 * @author Cullen Sturdivant
 * @version 1.0 10/1/2017
 */
public class Crate extends Package {

    private final String divider = " | ";
    private final String packageType = "Crate";
    
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
    
    public void print() {
        String fContent = content;
        if (content.length() > 17) {
            fContent = content.substring(0, 13);
            fContent = fContent + "...";
        }
        
        System.out.printf("| %8s" + divider, this.packageType);
        super.printForPackageType();
        System.out.printf("%10s" + divider, " ");
        System.out.printf("%7s" + divider, " ");
        System.out.printf("%17s" + divider, " ");
        System.out.printf("%10s" + divider, " ");
        System.out.printf("%15f" + divider, maxLoadWeight);
        System.out.printf("%17s" + divider, fContent);
        System.out.printf("%8s" + divider, " ");
        System.out.printf("%8s |%n", " ");
    }
    
}

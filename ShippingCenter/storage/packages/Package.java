
/**
 * @author Cullen Sturdivant
 * @version 1.1, 09/19/2017
 */
package storage.packages;

public class Package {

    private String trackingNumber;
    private String specification;
    private String mailingClass;

    /**
     * Creates a new Package with <b>null</b> tracking number, type,
     * specification, and mailing class, and a weight of <code>0</code> and
     * a volume of <code>0</code>.
     */
    Package() {
        this.trackingNumber = null;
        this.specification = null;
        this.mailingClass = null;
    }

    /**
     * Creates a new Package with specified attributes.
     * 
     * @param trackingNumber the tracking number of the package, 5-character string.
     * @param specification the specification of the package.
     * @param mailingClass the mailing class of the package.
     */
    Package(String trackingNumber, String specification,
            String mailingClass) {
        this.trackingNumber = trackingNumber;
        this.specification = specification;
        this.mailingClass = mailingClass;
    }
    
    /**
     * Accessor for the Tracking Number.
     * 
     * @return the tracking number of a package.
     */
    public String getTrackingNumber() {
        return this.trackingNumber;
    }

    /**
     * Accessor for the Specification.
     * 
     * @return the specification of a package.
     */
    public String getSpecification() {
        return this.specification;
    }

    /**
     * Accessor for the Mailing Class.
     * 
     * @return the mailing class of a package.
     */
    public String getMailingClass() {
        return this.mailingClass;
    }
}

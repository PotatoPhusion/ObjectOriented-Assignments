package storage.packages;

public class Package {

    private String trackingNumber;
    private String type;
    private String specification;
    private String mailingClass;
    private float  weight;
    private int    volume;

    /**
     * Creates a new Package with <b>null</b> tracking number, type,
     * specification, and mailing class, and a weight of <code>0</code> and
     * a volume of <code>0</code>.
     */
    Package() {
        this.trackingNumber = null;
        this.type = null;
        this.specification = null;
        this.mailingClass = null;
        this.weight = 0f;
        this.volume = 0;
    }

    /**
     * Creates a new Package with specified attributes.
     * 
     * @param trackingNumber the tracking number of the package, 5-character string.
     * @param type the type of the package.
     * @param specification the specification of the package.
     * @param mailingClass the mailing class of the package.
     * @param weight the weight of the package.
     * @param volume the volume of the package.
     */
    Package(String trackingNumber, String type, String specification,
            String mailingClass, float weight, int volume) {
        this.trackingNumber = trackingNumber;
        this.type = type;
        this.specification = specification;
        this.mailingClass = mailingClass;
        this.weight = weight;
        this.volume = volume;
    }

    /**
     * Getter for the Tracking Number.
     * 
     * @return the tracking number of a package.
     */
    public String getTrackingNumber() {
        return this.trackingNumber;
    }
    
    /**
     * Accessor for the Type.
     * 
     * @return the type of a package.
     */
    public String getType() {
        return this.type;
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

    /**
     * Accessor for the weight.
     * 
     * @return the weight of a package.
     */
    public float getWeight() {
        return this.weight;
    }

    /**
     * Accessor for the volume.
     * 
     * @return the volume of a package.
     */
    public int getVolume() {
        return this.volume;
    }
}

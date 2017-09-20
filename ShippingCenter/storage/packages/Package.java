package storage.packages;

 

// TODO: Everything
public class Package {

	private String trackingNumber;
	private String type;
	private String specification;
	private String mailingClass;
	private float  weight;
	private int    volume;

	Package() {
        this.trackingNumber = null;
        this.type = null;
        this.specification = null;
        this.mailingClass = null;
        this.weight = 0f;
        this.volume = 0;
	}

	Package(String trackingNumber, String type, String specification,
			String mailingClass, float weight, int volume) {
		this.trackingNumber = trackingNumber;
		this.type = type;
		this.specification = specification;
		this.mailingClass = mailingClass;
		this.weight = weight;
		this.volume = volume;
	}

	public String getTrackingNumber() {
		return this.trackingNumber;
	}

	public String getType() {
		return this.type;
	}

	public String getSpecification() {
		return this.specification;
	}

	public String getMailingClass() {
		return this.mailingClass;
	}

	public float getWeight() {
		return this.weight;
	}

	public int getVolume() {
		return this.volume;
	}
}

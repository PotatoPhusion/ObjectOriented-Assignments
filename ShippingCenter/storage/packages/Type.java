package storage.packages;


/**
 * The different types of packages.
 *
 * @author Cullen Studivant
 * @version 1.1, 10/1/2017
 */
public enum Type
{
    //POSTCARD ("Postcard"),
    //LETTER ("Letter"),
    ENVELOPE ("Envelope"),
    //PACKET ("Packet"),
    BOX ("Box"),
    CRATE ("Crate"),
    DRUM ("Drum"),
    //ROLL ("Roll"),
    //TUBE ("Tube");
    NONE ("None");
    
    private String type;
    
    Type(String type) {
        this.type = type;
    }
    
    public String getValue() {
        return this.type;
    }
}

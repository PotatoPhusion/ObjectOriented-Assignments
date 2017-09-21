package storage.packages;


/**
 * The mailing class types of a package.
 *
 * @author Cullen Sturdivant
 * @version 1.0, 9/20/2017
 */
public enum MailingClass
{
    FIRST_CLASS ("First Class"),
    PRIORITY ("Priority"),
    RETAIL ("Retail"),
    GROUND ("Ground"),
    METRO ("Metro");
    
    private String mc;
    
    MailingClass(String mc) {
        this.mc = mc;
    }
    
    public String getValue() {
        return this.mc;
    }
}

package storage.users;


/**
 * The base class of all users in the system.
 *
 * @author Cullen Sturdivant
 * @version 1.0, 10/2/2017
 */
public class User {

    private final int userID;
    private final String firstName;
    private final String lastName;
    
    public User(int userID, String firstName, String lastName) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public int getUserID() {
        return this.userID;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.firstName;
    }
    
    public String getFullName() {
        String fullName;
        fullName = this.firstName + " " + this.lastName;
        return fullName;
    }
    
}

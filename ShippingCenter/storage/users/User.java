package storage.users;

import java.io.Serializable;

/**
 * The base class of all users in the system.
 *
 * @author Cullen Sturdivant
 * @version 1.0, 10/2/2017
 */
public abstract class User implements Comparable, Serializable {

    private int userID;
    private String firstName;
    private String lastName;
    
    /**
     * Constructor for a user.
     * 
     * @param userID the unique ID of the user.
     * @param firstName the first name of the user.
     * @param lastName the last name of the user.
     */
    public User(String firstName, String lastName) {
        this.userID = 0;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    /**
     * Accessor for the userID.
     * 
     * @return the ID of the user.
     */
    public int getUserID() {
        return this.userID;
    }
    
    /**
     * Accessor for the first name of the user.
     * 
     * @return the first name of the user.
     */
    public String getFirstName() {
        return this.firstName;
    }
    
    /**
     * Accessor for the last name of the user.
     * 
     * @return the last name of the user.
     */
    public String getLastName() {
        return this.lastName;
    }
    
    /**
     * Combines the first and last names of a user into one String.
     * 
     * @return the full name of the user concatenated.
     */
    public String getFullName() {
        String fullName;
        fullName = this.firstName + " " + this.lastName;
        return fullName;
    }
    
    public void updateUserInfo(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public int compareTo(Object otherUser) {
        String otherName = ((User)otherUser).getLastName();
        int lastNameTest = this.getLastName().compareTo(otherName);
        
        if (lastNameTest == 0) {
            otherName = ((User)otherUser).getFirstName();
            return this.getFirstName().compareTo(otherName);
        }
        else {
            return lastNameTest;
        }
    }
    
    protected void generateUserID(int startID) {
        this.userID = startID;
    }
    
}

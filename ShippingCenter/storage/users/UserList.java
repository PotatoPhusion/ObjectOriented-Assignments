package storage.users;

import java.util.ArrayList;
import java.io.Serializable;

/**
 * Contains a list of all users.
 *
 * @author Cullen Sturdivant
 * @version 1.0, 10/2/2017
 */
public class UserList implements Serializable {

    private final int CUSTOMER_ID_BASE = 100000;
    private final int EMPLOYEE_ID_BASE = 200000;
    
    private ArrayList<User> users;
    
    /**
     * Constructor for the User List creates a new empty UserList.
     */
    public UserList() {
        this.users = new ArrayList<User>();
    }
    
    /**
     * Adds any type of user into the user database.
     * 
     * @param newUser the user you want to add into the database.
     */
    public void addUser(User newUser) {
        users.add(newUser);
        if (newUser.getUserID() == 0) {
            generateUserID(newUser);
        }
    }
    
    /**
     * Generates the user ID
     * 
     * @param u, for you being the user
     */
    private void generateUserID(User u) {
        if (u instanceof Employee) {
            int id = EMPLOYEE_ID_BASE + this.users.size();
            u.setNewUserID(id);
        }
        else if (u instanceof Customer) {
            int id = CUSTOMER_ID_BASE + this.users.size();
            u.setNewUserID(id);
        }
    }
}

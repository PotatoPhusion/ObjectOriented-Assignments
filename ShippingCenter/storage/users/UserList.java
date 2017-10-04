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
    }
    
}

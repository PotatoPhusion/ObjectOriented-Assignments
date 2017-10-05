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

    
    private final String line = "--------------------------------------------" +
                                "--------------------------------------------" +
                                "--------------------------------------------";
    private final String header = "| USER TYPE | USER ID |  FIRST NAME  | " + 
                                  "  LAST NAME   | PHONE NUMBER | " +
                                  "       ADDRESS        |    SSN    |   SALARY   |     BAN     |";
    
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
    

    public void showAll() {
        System.out.println(line);
        System.out.println(header);
        System.out.println(line);
        
        for (User user : users) {
            user.print();
        }
        System.out.println(line);
    }
    
    public int size() {
        return users.size();
    }
    
    public User get(int i) {
        return users.get(i);
    }

    /**
     * Generates the user ID
     * 
     * @param u for you being the user
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

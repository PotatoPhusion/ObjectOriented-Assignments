package storage.users;

import java.io.Serializable;

/**
 * A class containing information on a customer.
 *
 * @author Rafael Reza
 * @version 1.0, 10/02/2017
 */
public class Customer extends User implements Serializable {
   
    private String phoneNumber;
    private String address;
    
    /**
     * Constructor for a customer that automatically generates a new 
     * userID when called.
     * 
     * @param firstName the first name of the customer.
     * @param lastName the last name of the customer.
     * @param phoneNumber the phone number of the customer.
     * @param address the permanent address of the customer.
     */
    public Customer(String firstName, String lastName, String phoneNumber, String address) {

        // FIXME: I am not done by any means.
        super(100000, firstName, lastName);
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    
    /**
     * Constructor for a customer.
     * 
     * @param userID the unique userID of a customer.
     * @param firstName the first name of the customer.
     * @param lastName the last name of the customer.
     * @param phoneNumber the phone number of the customer.
     * @param address the permanent address of the customer.
     */
    public Customer(int userID, String firstName, String lastName,
                    String phoneNumber, String address) {       
        super(userID, firstName, lastName);
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

<<<<<<< HEAD
    public String getPhone() {
=======
    /**
     * Accessor for the phone number of a customer.
     * 
     * @return the phone number of the customer.
     */
    public String getPhoneNumber() {
>>>>>>> faef00e5763614e0c56d61e8552b5727ccaae499
        return this.phoneNumber;
    }
    
    /**
     * Accessor for the address of a customer.
     * 
     * @return the address of the customer.
     */
    public String getAddress() {
        return this.address;
    }
}
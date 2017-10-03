package storage.users;


/**
 * A class containing information on a customer.
 *
 * @author Rafael Reza
 * @version 1.0, 10/02/2017
 */
public class Customer extends User {
   
    private String phoneNumber; //phone number
    private String address;     // address 
    
    public Customer(int userID, String firstName, String lastName,
                    String phoneNumber, String address) {       
         super(userID, firstName, lastName);
         this.phoneNumber = phoneNumber;
         this.address = address;
    }

    public String getphone() {
        return this.phoneNumber;
    }
    public String address() {
        return this.address;
    }
}
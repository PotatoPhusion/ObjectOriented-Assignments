package storage.transactions;

import java.util.Date;
<<<<<<< HEAD
=======
import java.io.Serializable;
>>>>>>> faef00e5763614e0c56d61e8552b5727ccaae499

/**
 * Handles package transaction details.
 *
 * @author Cullen Sturdivant
 * @version 1.0, 10/2/2017
 */
<<<<<<< HEAD
public class Transaction {
=======
public class Transaction implements Serializable{
>>>>>>> faef00e5763614e0c56d61e8552b5727ccaae499
    
    private int customerID;
    private String trackingNumber;
    private Date shippingDate;
    private Date deliveryDate;
    private float shippingCost;
    private int employeeID;
    
<<<<<<< HEAD
    public Transaction(int customerID, String trackingNumber, Date shippingDate,
                              Date deliveryDate, float shippingCost, int employeeID) {
        this.customerID = customerID;
    }
    
=======
    /**
     * Constructor for a Transaction.
     * 
     * @param customerID the unique ID of the customer.
     * @param trackingNumber the tracking number of the package in the transaction.
     * @param shippingDate the date when the package was shipped.
     * @param deliveryDate the date when the package will reach its destination.
     * @param shippingCost the cost of shipping.
     * @param employeeID the ID of the employee perfoming the transaction.
     */
    public Transaction(int customerID, String trackingNumber, Date shippingDate,
                       Date deliveryDate, float shippingCost, int employeeID) {
        this.customerID = customerID;
    }
    
    /**
     * Accessor for the customerID of the transaction.
     * 
     * @return the ID of the customer involved in the transaction.
     */
>>>>>>> faef00e5763614e0c56d61e8552b5727ccaae499
    public int getCustomerID() {
        return this.customerID;
    }
    
<<<<<<< HEAD
=======
    /**
     * Accessor for the tracking number of the package.
     * 
     * @return the tracking number of the package in the transaction.
     */
>>>>>>> faef00e5763614e0c56d61e8552b5727ccaae499
    public String getTrackingNumber() {
        return this.trackingNumber;
    }
    
<<<<<<< HEAD
=======
    /**
     * Accessor for the shipping date.
     * 
     * @return the Date object when the package shipped.
     */
>>>>>>> faef00e5763614e0c56d61e8552b5727ccaae499
    public Date getShippingDate() {
        return this.shippingDate;
    }
    
<<<<<<< HEAD
=======
    /**
     * Accessor for the delivery date.
     * 
     * @return the Date object when the package will arrive at its destination.
     */
>>>>>>> faef00e5763614e0c56d61e8552b5727ccaae499
    public Date getDeliveryDate() {
        return this.deliveryDate;
    }
    
<<<<<<< HEAD
=======
    /**
     * Accessor for the shipping cost.
     * 
     * @return the cost of shipping.
     */
>>>>>>> faef00e5763614e0c56d61e8552b5727ccaae499
    public float getShippingCost() {
        return this.shippingCost;
    }
    
<<<<<<< HEAD
=======
    /**
     * Accessor for the employeeID.
     * 
     * @return the ID of the employee whom completed the transaction.
     */
>>>>>>> faef00e5763614e0c56d61e8552b5727ccaae499
    public int employeeID() {
        return this.employeeID;
    }
}

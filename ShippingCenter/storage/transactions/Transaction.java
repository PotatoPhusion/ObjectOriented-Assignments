package storage.transactions;

import java.util.Date;

import java.io.Serializable;

/**
 * Handles package transaction details.
 *
 * @author Cullen Sturdivant
 * @version 1.0, 10/2/2017
 */

public class Transaction implements Serializable{

    
    private int customerID;
    private String trackingNumber;
    private Date shippingDate;
    private Date deliveryDate;
    private float shippingCost;
    private int employeeID;
   
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
    public int getCustomerID() {
        return this.customerID;
    }

    /**
     * Accessor for the tracking number of the package.
     * 
     * @return the tracking number of the package in the transaction.
     */
    public String getTrackingNumber() {
        return this.trackingNumber;
    }

    /**
     * Accessor for the shipping date.
     * 
     * @return the Date object when the package shipped.
     */
    public Date getShippingDate() {
        return this.shippingDate;
    }
    
    /**
     * Accessor for the delivery date.
     * 
     * @return the Date object when the package will arrive at its destination.
     */
    public Date getDeliveryDate() {
        return this.deliveryDate;
    }

    /**
     * Accessor for the shipping cost.
     * 
     * @return the cost of shipping.
     */
    public float getShippingCost() {
        return this.shippingCost;
    }
    
    /**
     * Accessor for the employeeID.
     * 
     * @return the ID of the employee whom completed the transaction.
     */
    public int getEmployeeID() {
        return this.employeeID;
    }
}

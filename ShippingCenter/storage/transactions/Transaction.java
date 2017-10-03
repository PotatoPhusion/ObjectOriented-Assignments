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
    
    public Transaction(int customerID, String trackingNumber, Date shippingDate,
                       Date deliveryDate, float shippingCost, int employeeID) {
        this.customerID = customerID;
    }
    
    public int getCustomerID() {
        return this.customerID;
    }
    
    public String getTrackingNumber() {
        return this.trackingNumber;
    }
    
    public Date getShippingDate() {
        return this.shippingDate;
    }
    
    public Date getDeliveryDate() {
        return this.deliveryDate;
    }
    
    public float getShippingCost() {
        return this.shippingCost;
    }
    
    public int employeeID() {
        return this.employeeID;
    }
}

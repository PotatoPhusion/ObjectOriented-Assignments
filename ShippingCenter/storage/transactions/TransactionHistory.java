package storage.transactions;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

import java.text.SimpleDateFormat;

/**
 * Contains a list of all transaction history.
 * The list can be retrieved from a file and saved to a file.
 *
 * @author Cullen Sturdivant
 * @version 1.0, 10/2/2017
 */
public class TransactionHistory implements Serializable {
    
    private final String line = "------------------------------------------------------------------------------------------------------";
    private final String header = "| CUSTOMER ID | TRACKING # |    SHIPPING DATE    |    DELIVERY DATE    | SHIPPING COST | EMPLOYEE ID |";
    private final String divider = " | ";
    
    private static ArrayList<Transaction> transactionList;
    
    /**
     * Constructor for the transaction history.
     */
    public TransactionHistory() {
        transactionList = new ArrayList<Transaction>();
    }
        
    /**
     * Adds a new transaction to the transaction history list.
     * 
     * @param transaction the transaction to be stored in history.
     */
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }
    
    public void print() {
        System.out.println(line);
        System.out.println(header);
        System.out.println(line);
        
        for (Transaction trans : transactionList) {
            System.out.printf("| %11d" + divider, trans.getCustomerID());
            System.out.printf("%10s" + divider, trans.getTrackingNumber());
            
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
            String dateStr = sdf.format(trans.getShippingDate());
            
            System.out.printf("%19s" + divider, dateStr);
            
            String newerDateStr = sdf.format(trans.getDeliveryDate());
            
            System.out.printf("%19s" + divider, newerDateStr);
            
            System.out.printf("$%13.2f" + divider, trans.getShippingCost());
            System.out.printf("%11s |", trans.getEmployeeID());
        }
        System.out.println(line);
    }
}

package storage.transactions;

import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
>>>>>>> faef00e5763614e0c56d61e8552b5727ccaae499

/**
 * Contains a list of all transaction history.
 * The list can be retrieved from a file and saved to a file.
 *
 * @author Cullen Sturdivant
 * @version 1.0, 10/2/2017
 */
<<<<<<< HEAD
public class TransactionHistory {
    
    private ArrayList<Transaction> transactionList;
    
=======
public class TransactionHistory implements Serializable {
    
    private static ArrayList<Transaction> transactionList;
    
    /**
     * Constructor for the transaction history.
     */
>>>>>>> faef00e5763614e0c56d61e8552b5727ccaae499
    public TransactionHistory() {
        transactionList = new ArrayList<Transaction>();
    }
    
<<<<<<< HEAD
=======
    /**
     * Adds a new transaction to the transaction history list.
     * 
     * @param transaction the transaction to be stored in history.
     */
>>>>>>> faef00e5763614e0c56d61e8552b5727ccaae499
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }
}

package storage.transactions;

import java.util.ArrayList;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

/**
 * Contains a list of all transaction history.
 * The list can be retrieved from a file and saved to a file.
 *
 * @author Cullen Sturdivant
 * @version 1.0, 10/2/2017
 */ 
public class TransactionHistory implements Serializable {
    
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
}

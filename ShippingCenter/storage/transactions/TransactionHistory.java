package storage.transactions;

import java.util.ArrayList;

/**
 * Contains a list of all transaction history.
 * The list can be retrieved from a file and saved to a file.
 *
 * @author Cullen Sturdivant
 * @version 1.0, 10/2/2017
 */
public class TransactionHistory {
    
    private ArrayList<Transaction> transactionList;
    
    public TransactionHistory() {
        transactionList = new ArrayList<Transaction>();
    }
    
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }
}

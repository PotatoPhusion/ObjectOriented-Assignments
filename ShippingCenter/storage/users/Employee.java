package storage.users;


/**
 * A class containing information on an employee.
 *
 * @author Cullen Sturdivant
 * @version 1.0, 10/2/2017
 */
public class Employee extends User {
    
    private int ssn;                // Social Security Number
    private float monthlySalary;
    private int ban;                // Bank Account Number
    
    public Employee(int userID, String firstName, String lastName,
                    int ssn, float monthlySalary, int ban) {
        super(userID, firstName, lastName);
        this.ssn = ssn;
        this.monthlySalary = monthlySalary;
        this.ban = ban;
    }
    
    public int getSSN() {
        return this.ssn;
    }
    
    public float getMonthlySalary() {
        return this.monthlySalary;
    }
    
    public int getBankAccountNumber() {
        return this.ban;
    }
}

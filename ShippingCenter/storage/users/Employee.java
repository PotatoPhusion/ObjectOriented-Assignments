package storage.users;

import java.io.Serializable;

/**
 * A class containing information on an employee.
 *
 * @author Cullen Sturdivant
 * @version 1.0, 10/2/2017
 */
public class Employee extends User implements Serializable {
    
    private final int EMPLOYEE_ID_BASE = 200000;
    
    private int ssn;                // Social Security Number
    private float monthlySalary;
    private int ban;                // Bank Account Number
    
    /**
     * Constructor for an Employee.
     * 
     * @param userID the unique ID of the employee.
     * @param firstName the first name of the employee.
     * @param lastName the last name of the employee.
     * @param ssn the social security number (SSN) of the employee.
     * @param monthlySalary the monthly salary of the employee.
     * @param ban the direct deposit bank account number of the employee.
     */
    public Employee(String firstName, String lastName,
                    int ssn, float monthlySalary, int ban) {
        super(firstName, lastName);
        generateUserID(EMPLOYEE_ID_BASE);
        this.ssn = ssn;
        this.monthlySalary = monthlySalary;
        this.ban = ban;
    }
    
    /**
     * Accessor for the social security number (SSN).
     * 
     * @return the social security number of the employee.
     */
    public int getSSN() {
        return this.ssn;
    }
    
    /**
     * Accessor for the salary of the employee.
     * 
     * @return the salary the employee makes every month.
     */
    public float getMonthlySalary() {
        return this.monthlySalary;
    }
    
    /**
     * Accessor for the employee's direct deposit bank account number.
     * 
     * @return the bank account number of the employee.
     */
    public int getBankAccountNumber() {
        return this.ban;
    }
    
    public void updateUserInfo(String firstName, String lastName,
                               int ssn, float salary, int ban) {
        super.updateUserInfo(firstName, lastName);
        this.ssn = ssn;
        this.monthlySalary = salary;
        this.ban = ban;
    }
    
}

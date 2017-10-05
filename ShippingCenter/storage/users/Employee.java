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
    
    private final String divider = " | ";
    
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
    
    /**
     * Update the user information for Employee
     * 
     * @param firstName first name of user
     * @param lastName last name of user
     * @param ssn social security number
     * @param salary salary of the employee
     * @param ban the bank account number
     */
    public void updateUserInfo(String firstName, String lastName,
                               int ssn, float salary, int ban) {
        super.updateUserInfo(firstName, lastName);
        this.ssn = ssn;
        this.monthlySalary = salary;
        this.ban = ban;
    }
<<<<<<< HEAD
    
    public void print() {
        System.out.printf("| %12s" + divider, "Employee");
        super.print();
        System.out.printf("%12s" + divider, " ");
        System.out.printf("%21s" + divider, " ");
        System.out.printf("%9d" + divider, ssn);
        System.out.printf("$%10.2f" + divider, monthlySalary);
        System.out.printf("%11d |", ban);
    }
    
=======
>>>>>>> 3af82bc8366c71188a942e5d506a1c97726556f2
}

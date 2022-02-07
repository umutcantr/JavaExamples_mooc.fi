/*
 * Debt class shows balance with interest after years.
 */
package oopdebt;

/**
 *
 * @author umut
 */
public class Debt {
    private double balance;
    private double interestRate;
    
    public Debt(double initialBalance, double initialInterestRate){
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }
    
    public void printBalance(){
        System.out.println("Current balance: "+this.balance);
    }
    
    public void waitOneYear(){
         balance = balance * interestRate;
    }
}

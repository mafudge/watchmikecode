package FudgeBanking;

/**
 * A class to model an actual checking account
 * @author mafudge
 */
public class CheckingAccount {
    
    private final String accountNumber;
    private double balance;
    
    /**
     *  Constructor for the class makes a new checking account
     * @param acctno the account number
     * @param balance the opening balance
     */
    public CheckingAccount(String acctno, double balance) {
        this.accountNumber = acctno;
        this.balance = balance;       
    }
    
    /**
     * Adds money to the checking account
     * @param amount the amount to add to the balance
     */
    public void Deposit(double amount) {
        this.balance = this.balance + amount;
    }
    
    /**
     * Removes money from the checking account
     * @param amount the amount to remove from the balance
     */
    public void Withdrawl(double amount) {
        this.balance = this.balance - amount;
    }
    
    /**
     * Get the current balance
     * @return returns the current balance
     */
    public double Balance() {
        return this.balance;
    }
    
    /**
     * Used for printing the class
     * @return a string representation of the account
     */
    @Override 
    public String toString() {
        return String.format("ACCOUNT: %s\nBALANCE: $%.2f"
                ,this.accountNumber, this.balance);        
    }
}

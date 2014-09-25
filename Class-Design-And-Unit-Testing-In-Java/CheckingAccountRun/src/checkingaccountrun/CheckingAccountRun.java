/*
 * This demo code executes a simulation of a checking account
 */
package checkingaccountrun;

import FudgeBanking.CheckingAccount;

/**
 *
 * @author mafudge
 */
public class CheckingAccountRun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CheckingAccount myacct = new CheckingAccount("Mike", 99.50);
        System.out.println(myacct);
        
    }
    
}

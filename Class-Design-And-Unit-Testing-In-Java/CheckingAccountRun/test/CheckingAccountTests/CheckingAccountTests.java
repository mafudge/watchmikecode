/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckingAccountTests;

import FudgeBanking.CheckingAccount;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author mafudge
 */
public class CheckingAccountTests {
    
    public CheckingAccountTests() {
    }
    
    // TODO add test methods here. Arrange. Act. Assert.
     @Test
     public void TestBalanceShouldBeSameAsOpeningBalance() {
           double expectedBalance = 99.99;
           CheckingAccount c = new CheckingAccount("test", expectedBalance);
           double actualBalance = c.Balance();
           Assert.assertEquals(expectedBalance, actualBalance);           
     }
     
     @Test
     public void TestDepositBalanceShouldBeMoreThanOpeningBalance() {
            double openingBalance = 50.0;
            double depositAmount = 10.0;
            double expectedBalance = openingBalance + depositAmount;
            CheckingAccount c = new CheckingAccount("test", openingBalance);
            c.Deposit(depositAmount);           
            double actualBalance = c.Balance();
            Assert.assertEquals(expectedBalance, actualBalance);           
     }
     
     @Test
     public void TestWithdrawlBalanceShouldBeLessThanOpeningBalance() {
            double openingBalance = 50.0;
            double withdrawlAmount = 10.0;
            double expectedBalance = openingBalance - withdrawlAmount;
            CheckingAccount c = new CheckingAccount("test", openingBalance);
            c.Withdrawl(withdrawlAmount);           
            double actualBalance = c.Balance();
            Assert.assertEquals(expectedBalance, actualBalance);           
     }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeviThompsonLab03;

/**
 *
 * @author cccaw
 */
public class SavingsAccount extends Account{
    
    //creating a state of SavingsAccount, which is a double and is interestRate
    private double interestRate;
    
    //method that gets interestRate when called and returns it
    public double getInterestRate() {
        return this.interestRate;
    }
    
    //method that sets the interestRate when called
    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }
    
    //constructor that call the parent class's constructor
    public SavingsAccount(Money balance) {
        super(balance);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeviThompsonLab03;

/**
 *
 * @author levi.thompson
 */
public class Account {
    private double balance;
    
    public Account() {
        this.balance = 0.0;
    }
    
    public Account(double balance) {
        this.balance = balance;
    }
    
    public void withdraw(double m) {
         this.balance = this.balance - m;
    }
    
    public void deposit(double m) {
        this.balance = this.balance + m;
    }
    
    public double getBalance() {
        return this.balance;
    }
}

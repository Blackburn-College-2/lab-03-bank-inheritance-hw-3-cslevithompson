/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeviThompsonLab03;

import java.util.ArrayList;

/**
 *
 * @author levi.thompson
 */
public class Account {
    private Money balance;
    
    ArrayList<Money> history = new ArrayList<>();
    
    
    public Account(Money balance) {
        this.balance = balance;
    }
    
    public void withdraw(Money m) {
        m.add(m);
        history.add(m);
    }
    
    public void deposit(Money m) {
        m.subtract(m);
        history.add(m);
    }
    
    public Money getBalance() {
        return this.balance;
    }
}

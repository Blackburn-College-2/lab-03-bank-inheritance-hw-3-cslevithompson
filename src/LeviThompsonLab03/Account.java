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
 * cccaw is my personal laptop in case the curiosity rises
 */
public abstract class Account {

    private Money balance;
    //creating a new arraylist to store history
    private ArrayList<Money> history = new ArrayList<>();

    //constructor that initialies balance in account
    public Account(Money balance) {
        history.add(new Money(balance.getCurrency(),balance.getAmount()));
        
        
        
        this.balance = balance;
    }

    //method that takes money out of the account
    public void withdraw(Money m) {
        history.add(new Money(m.getCurrency(), -(m.getAmount())));
        this.balance.subtract(m);
        
    }

    //method that puts money into the account
    public void deposit(Money m) {
        history.add(new Money(m.getCurrency(), m.getAmount()));
        this.balance.add(m);        
    }

    //method that gets the balance
    public Money getBalance() {
        return this.balance;
    }

    //method that prints the history from the array
    public void printHistory() {
        for (int i = 0; i < history.size(); i++) {
            System.out.println(history.get(i));
        }

    }
    
    @Override
    public String toString() {
        return getBalance().toString();
    }

}

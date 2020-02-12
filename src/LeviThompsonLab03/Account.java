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

    private ArrayList<Money> history = new ArrayList<>();

    public Account(Money balance) {
        this.balance = balance;
        history.add(balance);
    }

    public void withdraw(Money m) {
        history.add(new Money(m.getCurrency(), -(m.getAmount())));
        this.balance.subtract(m);
        
    }

    public void deposit(Money m) {
        this.balance.add(m);
        history.add(new Money(m.getCurrency(), m.getAmount()));
    }

    public Money getBalance() {
        return this.balance;
    }

    public void printHistory() {
        //System.out.println(history.get(0));
        //System.out.println(history.get(1));
        for (int i = 0; i < history.size(); i++) {
            //System.out.println(i);
            System.out.println(history.get(i));
        }

    }

}

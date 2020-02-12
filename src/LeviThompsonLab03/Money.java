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
public class Money {

    private Currency currency;
    private double amount;

    public Money(Currency currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public double getAmount() {
        return this.amount;
    }
    
    public String getAmountString() {
        String amountInString = currency.toString() + amount;

        return amountInString;
    }

    public Money add(Money input) {
        if (this.currency != input.currency) {
            throw new ArithmeticException("not the same currency");
        } else {
            input.amount += this.amount;
        }

        return input;
    }

    public Money subtract(Money input) {
        if (this.currency != input.currency) {
            throw new ArithmeticException("not the same currency");
        } else {
            input.amount -= this.amount;
        }

        return input;
    }

    @Override
    public String toString() {
        return getAmountString();

    }
}

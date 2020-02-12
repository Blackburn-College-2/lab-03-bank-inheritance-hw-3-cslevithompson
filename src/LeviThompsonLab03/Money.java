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

    //constructor for money that applies a currency and an amount when created
    public Money(Currency currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    //method to get currency of money
    public Currency getCurrency() {
        return this.currency;
    }

    //method to get amount of money
    public double getAmount() {
        return this.amount;
    }
    
    //method to return a string version of money
    public String getAmountString() {
        String amountInString = currency.toString() + amount;

        return amountInString;
    }

    //method to add money to money
    public Money add(Money input) {
        //stops money from adding if currency is not the same
        //throws an error
        if (this.currency != input.currency) {
            throw new ArithmeticException("not the same currency");
        } else {
            input.amount += this.amount;
        }

        return input;
    }

    //method to subtract money from money
    public Money subtract(Money input) {
        //stops money from subtracting if currency is not the same
        //throws an error
        if (this.currency != input.currency) {
            throw new ArithmeticException("not the same currency");
        } else {
            input.amount -= this.amount;
        }

        return input;
    }

    //overrides the toString method to print money as getAmountString
    @Override
    public String toString() {
        return getAmountString();

    }
}

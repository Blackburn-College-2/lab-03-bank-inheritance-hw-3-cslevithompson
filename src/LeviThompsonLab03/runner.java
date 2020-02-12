/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeviThompsonLab03;

/**
 *
 * @author paul.kline
 */
public class runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a new currency
        Currency c = new Currency("USD", "$");
        //creating a new money
        Money m = new Money(c, 10.0);
        //creating a new account
        Account s = new Account(m);
        s.withdraw(new Money(c, 20.0));
        System.out.println(s);
        s.deposit(new Money(c, 10.0));
        System.out.println(s);
//        s.withdraw(new Money(c, 30));
//        System.out.println(s);
//        s.deposit(new Money(c, 50));
//        System.out.println(s);
//        s.withdraw(new Money(c, 80));
//        System.out.println(s);
//        s.withdraw(new Money(c, 10));
//        System.out.println(s);
//        s.withdraw(new Money(c, 50));
//        System.out.println(s);
//        s.deposit(new Money(c, 20));
//        System.out.println(s);
//        s.deposit(new Money(c, 60));
//        System.out.println(s);
//        s.deposit(new Money(c, 70));
//        System.out.println(s);
//        s.printHistory();
    }

}

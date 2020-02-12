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
        Currency c = new Currency("USD","$");
        Money m = new Money(c,10.0);
        Account s = new Account(m);
        //s.printHistory();
        s.withdraw(new Money(c, 20));
        //s.withdraw(m);
       s.printHistory();
//        System.out.println(s.getBalance().toString());
//        
    }

}

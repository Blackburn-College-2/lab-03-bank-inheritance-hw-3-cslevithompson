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
        // TODO code application logic here
        Account test = new Account(25.0);
        System.out.println(test.getBalance());
        test.withdraw(5.0);
        System.out.println(test.getBalance());
    }
    
}

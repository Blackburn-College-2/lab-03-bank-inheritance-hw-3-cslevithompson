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
public class Currency {
    
    private String name;
    private String symbol;
    
    //constructor for currency that applies a name and symbol when created
    public Currency(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }
    
    public boolean equals(Currency currency) {
        
        return this.name.contentEquals(currency.name);
    }
    
    
    @Override
    public String toString() {
        return name + " " + symbol;
    }
}

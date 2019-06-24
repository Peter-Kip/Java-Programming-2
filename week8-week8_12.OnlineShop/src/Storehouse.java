
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiplagat
 */
public class Storehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;
    
    public Storehouse(){
        this.prices = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }
  
    public void addProduct(String product, int price, int stock){
       prices.put(product, price);
       stocks.put(product, stock); 
    }
    public int price(String product){
        if(this.prices.containsKey(product)){
            return this.prices.get(product);
        }
        return -99;
    }
    
    public int stock(String product){
        if(this.stocks.containsKey(product)){
            return this.stocks.get(product);
        }
        return 0;
    }
    public boolean take(String product){
        int stockNumber = 0;
        
        if(this.stocks.containsKey(product)){
            stockNumber = this.stocks.get(product);
            if(stockNumber>0){
                stockNumber--;
                this.stocks.replace(product, stockNumber);
                return true;
            } else 
            return false;
        } else {
            return false;
        }
    }
    
    public Set<String> products(){
        Set<String> products = new HashSet<String>();
        
        for(String product : stocks.keySet()){
            products.add(product);
        }
        return products;
    } 
    
}

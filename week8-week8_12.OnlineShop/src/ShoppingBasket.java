
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiplagat
 */
public class ShoppingBasket {
    private Map<String, Purchase> basket;
    
    public ShoppingBasket(){
        basket = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price){
        if(this.basket.containsKey(product)){
            this.basket.get(product).increaseAmount();
        }else{
            Purchase newPurchase = new Purchase(product, 1 , price);
            this.basket.put(product, newPurchase);
        }
    }
    
    public int price(){
        int totalPrice = 0;
        
        for(Purchase p : this.basket.values()){
            totalPrice += p.price();
        }
        return totalPrice;
    }
    
    public void print(){
        for(Purchase p : this.basket.values()){
            System.out.println(p.toString());
        }
    }
}

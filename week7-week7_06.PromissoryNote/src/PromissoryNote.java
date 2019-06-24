
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiplagat
 */
public class PromissoryNote {
    private HashMap<String, Double> hmap;
    
    public PromissoryNote(){
        hmap = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value) {
        toWhom = stringCleaner(toWhom);
        this.hmap.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
        whose = stringCleaner(whose);
        if(this.hmap.containsKey(whose)){
            return hmap.get(whose);
        }
        return 0;
        }
    private String stringCleaner(String name){
        if(name == null){
            return "";
        }
       return name = name.toLowerCase().trim();
    }
    
}

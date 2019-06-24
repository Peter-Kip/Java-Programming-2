
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiplagat
 */
public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private int counter;
    
    public Container(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
        this.counter = 0;
    }
    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight() + this.totalWeight() <= this.maxWeight){
            this.suitcases.add(suitcase);
            this.counter++;
        }  
    }
    public String toString(){
        return this.counter + " suitcases " + this.totalWeight() + "("  + "kg" +")";
        
    }
    public int totalWeight(){
        int totalWeight = 0;
        
        for(Suitcase s : suitcases){
            totalWeight += s.totalWeight();
        }
        return totalWeight;
    }
    
    public void printThings(){
        for(Suitcase s : suitcases){
            s.printThings();
        }
    }   
}

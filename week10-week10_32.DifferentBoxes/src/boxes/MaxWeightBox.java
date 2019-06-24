/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Kiplagat
 */
public class MaxWeightBox extends Box{
    private int maxWeight;
    private Collection<Thing> things;
  
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.things = new LinkedList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        int currentWeight = 0;
        for(Thing t : things){
            currentWeight += t.getWeight();
        }
        if(thing.getWeight() + currentWeight <= this.maxWeight){
            things.add(thing);
        }
         
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(things.contains(thing)){
            return true;
        }else{
            return false; 
        } 
    }
    
}

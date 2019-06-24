
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
public class Box implements ToBeStored{
    private double maxWeight;
    private ArrayList<ToBeStored> things;
    
    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.things = new ArrayList<ToBeStored>();
    }
    @Override
    public double weight() {
        double weight = 0;
        for(ToBeStored t: things){
            weight += t.weight();
        }
        return weight;
    }
    public void add(ToBeStored thing){
        if(this.weight() + thing.weight() < this.maxWeight){
            things.add(thing);
        }
    }
    
    @Override
    public String toString(){
        return "Box: " + this.things.size() + " things, total weight " + this.weight() + " kg";     
    }
    
}

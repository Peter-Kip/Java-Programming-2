
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
public class Suitcase {
    private int max_weight;
    private ArrayList<Thing> things;
    private int counter;
    
    
    
    public Suitcase(int max_weight){
        this.max_weight = max_weight;
        this.things = new ArrayList<Thing>();
        this.counter = 0;
    }

    Suitcase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void addThing(Thing thing){
        if(thing.getWeight() + this.totalWeight() <= this.max_weight){
            this.things.add(thing);
            this.counter++;
        }
        
    }
    public String toString(){
        if(this.counter == 0){
            return "empty " +  " (" + this.totalWeight() + " kg" + ")";
        }else if(counter == 1){
            return this.counter + " thing " + " (" + this.totalWeight() + " kg" + ")";
        }else
            return this.counter + " things " + " (" + this.totalWeight() + " kg" + ")";
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for(Thing t : things){
            totalWeight += t.getWeight();
        }
        return totalWeight;
    }
    
    public void printThings(){
        for(Thing t : things){
            System.out.println(t);
        }
    }
    
    public Thing heaviestThing(){
       int heaviest = 0;
       Thing heaviestThing = new Thing ("", 0);
       
       if(this.things.isEmpty()){
           return null;
       }else{
           for(Thing t : things){
               if(t.getWeight() > heaviest){
                   heaviest = t.getWeight();
                   heaviestThing = t;
               }
           }
       }   
        return heaviestThing;
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiplagat
 */
public class Thing {
    private String name;
    private int weight;
    
    public Thing(String name, int weight){
        this.name = name;
        this.weight = weight;
        
    }

    Thing(Thing brick, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getName(){
        return this.name;
    }
    public int getWeight(){
        return this.weight;
    }
    public String toString(){
        return this.name + " ("+ this.weight + " kg"+ ")";
    }
}

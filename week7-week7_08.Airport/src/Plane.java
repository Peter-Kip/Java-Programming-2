
import java.util.ArrayList;
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
public class Plane {
    private HashMap<String, String> planes;

    
    public Plane(){
        this.planes = new HashMap<String, String>();
   
    }
    
    public void add(String planeID, String capacity){
        this.planes.put(planeID, capacity);
    }
    
    public String get(String planeID){
        return planeID + " ("+ this.planes.get(planeID) + " ppl)";
    }
    
    
    @Override
    public String toString(){
        String buffer ="";
        
        for(String i : this.planes.keySet()){
            buffer += i + " (" + this.planes.get(i)+" ppl)\n";
        }
        return buffer; 
    }   
}


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
public class Flight {
    private ArrayList<String> flights;
    
    public Flight(){
        this.flights = new ArrayList<String>();
    }
    
    public void add(String entry){
        this.flights.add(entry);
    }
    
    @Override
    public String toString(){
        String buffer ="";
        
        for(String i : this.flights){
            buffer += i + "\n";
        }
        return buffer;
    }
  
}

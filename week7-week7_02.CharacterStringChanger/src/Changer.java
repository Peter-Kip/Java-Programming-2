
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
public class Changer {
    private ArrayList<Change> changes;

    
     public Changer(){
         this.changes = new ArrayList<Change>();
         
     }
    
     public void addChange(Change change){
         this.changes.add(change);
         
     }
     
     public String change(String characterString){
         //String toReturn = "";
         for(Change change : changes){
             characterString = change.change(characterString);
         }
         return characterString; 
     }
}

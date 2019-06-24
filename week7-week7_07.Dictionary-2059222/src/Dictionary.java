
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
public class Dictionary {
    private HashMap<String, String> hmap;
    
    public Dictionary(){
        hmap = new HashMap<String, String>();
    }
    
    public String translate(String word){
        if(this.hmap.containsKey(word)){
            return this.hmap.get(word);
        }
        return null;
        
    }
    public void add(String word, String translation){
        this.hmap.put(word, translation);
    }
    public int amountOfWords(){
        int counter = 0;
        for(String key : hmap.keySet()){
            counter++;
        }
        return counter; 
    }
    public ArrayList<String> translationList(){
        ArrayList<String> arrayString = new ArrayList<String>();
        for(String key : hmap.keySet()){
            arrayString.add(key + " = " + hmap.get(key));
        }
        return arrayString;
        
    }
    
}

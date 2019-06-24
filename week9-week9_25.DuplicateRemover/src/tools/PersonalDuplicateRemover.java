/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Kiplagat
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    private Set<String> characterStrings;
    private int numberOfDuplicates;
    
    public PersonalDuplicateRemover(){
        this.characterStrings = new HashSet<String>();
        this.numberOfDuplicates = 0;
        
    }

    @Override
    public void add(String characterString) {
         if(this.characterStrings.contains(characterString)){
             this.numberOfDuplicates++;
         }
         this.characterStrings.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        
        return this.numberOfDuplicates;   
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        if(this.characterStrings.isEmpty()){
            Set<String> empty = new HashSet<String>();
            return empty;
        }
        return this.characterStrings;
        
    }

    @Override
    public void empty() {
        this.characterStrings.clear();
        this.numberOfDuplicates = 0;
         
    }
    
}

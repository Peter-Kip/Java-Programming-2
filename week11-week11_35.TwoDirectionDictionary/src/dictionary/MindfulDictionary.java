/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Kiplagat
 */
public class MindfulDictionary {
    private Map<String, String> englishWords;
    private Map<String, String> finnishWords;
    private File file;
    private Scanner fileReader;
    private FileWriter writer;
    
    public MindfulDictionary(){
       this.englishWords = new HashMap<String, String>();
       this.finnishWords = new HashMap<String, String>();
    }
    
    public MindfulDictionary(String file) throws FileNotFoundException, IOException{
       this.englishWords = new HashMap<String, String>();
       this.finnishWords = new HashMap<String, String>();
       this.file = new File(file);
       try{
            this.fileReader = new Scanner(this.file);
       }
       catch(FileNotFoundException e){
            System.out.println("file not found");
       }
    }
    
    public boolean load(){
        if(!this.fileReader.hasNextLine()){
            return false;
        }else{
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   // the line is split at :
                this.finnishWords.put(parts[0], parts[1]);
                this.englishWords.put(parts[1], parts[0]);
            }
            return true;
        }
    }
    
    public boolean save() {
        try {
            this.writer = new FileWriter(file);
            for(String s : this.finnishWords.keySet()){
                String line = s + ":" + this.finnishWords.get(s) + "\n";
                writer.write(line);
            }
            writer.close();
            
        } catch (IOException e) {
            return false;
        }
        return true;
    }
    
    public void add(String word, String translation){
       if(!this.finnishWords.containsKey(word) && !this.englishWords.containsKey(translation)){
           this.finnishWords.put(word, translation);
           this.englishWords.put(translation, word);
       }
    }
    
    public String translate(String word){
        if(this.finnishWords.containsKey(word)){
            return this.finnishWords.get(word);
        }else if(this.englishWords.containsKey(word)){
            return this.englishWords.get(word);
        }else{
            return null;
        }
    }
    
    public void remove(String word){
        if(this.englishWords.containsKey(word)){
            this.englishWords.remove(word);
            String key = this.getKeyByValue(finnishWords, word);
            this.finnishWords.remove(key);
        }else if(this.finnishWords.containsKey(word)){
            this.finnishWords.remove(word);
            String key = this.getKeyByValue(englishWords, word);
            this.englishWords.remove(key);
        }
    }
    
    public <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
    
}

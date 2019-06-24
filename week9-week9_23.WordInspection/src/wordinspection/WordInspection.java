/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kiplagat
 */
public class WordInspection {
    private File file;
    
    public WordInspection(File file) throws Exception{
        this.file = file;
    }
    
    public int wordCount() throws FileNotFoundException{
        Scanner reader = new Scanner(file, "UTF-8");
        String word;
        int counter = 0;
        
        while(reader.hasNextLine()){
            word = reader.nextLine();
            counter++;
        }
        return counter;
    }
    
    public List<String> wordsContainingZ() throws FileNotFoundException{
        Scanner reader = new Scanner(file, "UTF-8");
        List<String> list = new ArrayList<String>();
        String word = "";
        
        while(reader.hasNextLine()){
            word = reader.nextLine();
            if(word.contains("z")){
                list.add(word);
            }
        }
        return list;
    }
    
    public List<String> wordsEndingInL() throws FileNotFoundException{
        Scanner reader = new Scanner(file, "UTF-8");
        List<String> list = new ArrayList<String>();
        String word = "";
        
        while(reader.hasNextLine()){
            word = reader.nextLine();
            if(word.endsWith("l")){
                list.add(word);
            }
        }
        return list;
    }
    
    public List<String> palindromes() throws FileNotFoundException{
        Scanner reader = new Scanner(file, "UTF-8");
        List<String> list = new ArrayList<String>();
        String word = "";
        String reverse = "";
        
        while(reader.hasNextLine()){
            word = reader.nextLine();
            reverse = new StringBuffer(word).reverse().toString();
            
            if(word.equalsIgnoreCase(reverse)){
                list.add(word);
            }  
        }
        return list;
    }
    
    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException{
        Scanner reader = new Scanner(file, "UTF-8");
        List<String> list = new ArrayList<String>();
        String word = "";
        
        while(reader.hasNextLine()){
            word = reader.nextLine();
            
            if(word.contains("a") && word.contains("e") && word.contains("i") && word.contains("o") && word.contains("u") && word.contains("y") && word.contains("ä") && word.contains("ö")){
                list.add(word);
            }
        }
        return list;      
    }
    
}

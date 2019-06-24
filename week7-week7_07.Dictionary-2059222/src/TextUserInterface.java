
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiplagat
 */
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
        
    }
    public void start(){
        statement();
        
        while(true){
            System.out.println("enter the statement: ");
            String input = reader.nextLine();
            input = this.stringCleaner(input);
            
            if(input.equals("quit")){
                System.out.println("cheers!");
                break;
            }else if(input.equals("add")){
                this.add();
            }else if(input.equals("translate")){
                this.translate();
            }
        }
        
    }
    public void statement(){
        System.out.println("input statements:");
        System.out.println("quit - quits the user interface");
        System.out.println("add - adds the word to the dictionary");
        System.out.println("translate - gives the translation of the word");
        System.out.println();
    }
    public void add(){
        System.out.println("In finnish: ");
        String finnishWord = reader.nextLine();
        finnishWord = this.stringCleaner(finnishWord);
        
        System.out.println("In english: ");
        String englishWord = reader.nextLine();
        englishWord = this.stringCleaner(englishWord);
        
        this.dictionary.add(finnishWord, englishWord );
    }
    public void translate(){
        System.out.println("Give a word; ");
        String finnishWord = reader.nextLine();
        finnishWord = this.stringCleaner(finnishWord);
        
       System.out.println("Translation: " + this.dictionary.translate(finnishWord));
    }
    
    
    private String stringCleaner(String string){
        if(string == null){
            return "";
        }
        return string.toLowerCase().trim();
    }
}

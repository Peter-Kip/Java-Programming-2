/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kiplagat
 */
public class Analysis {
    private File file;
    
     public Analysis(File file) throws Exception{
         this.file = file;
     }
    
     public int lines() throws FileNotFoundException{
        Scanner reader = new Scanner(file, "UTF-8");
            int counter = 0;
            String line = "";
            while(reader.hasNextLine()){
                line = reader.nextLine();
                counter++;
            }

            return counter;
         }
     
     public int characters() throws FileNotFoundException{
        Scanner reader = new Scanner(file, "UTF-8");
            String line = "";
            int chars = 0;
            int lines = 0;
            while (reader.hasNextLine()) {
                line = reader.nextLine();
                chars += line.length();
                lines++;
            }
            return chars + lines;
         }
}

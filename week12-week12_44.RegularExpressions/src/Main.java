
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write test code here 
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Give a string: ");
        String string = reader.nextLine();
        
        if(isAWeekDay(string)){
            System.out.println("The form is fine.");
        }else{
            System.out.println("The form is wrong.");
        }
        
        if(allVowels(string)){
            System.out.println("The form is fine.");
        }else{
            System.out.println("The form is wrong.");
        }
        
        if(clockTime(string)){
            System.out.println("The form is fine.");
        }else{
            System.out.println("The form is wrong.");
        }
    }
    
    public static boolean isAWeekDay(String string){
        if(string.matches("mon|tue|wed|thu|fri|sat|sun")){
            return true;
        }else
            return false;
    }
    public static boolean allVowels(String string){
        if(string.matches("[aeiouäö]*")){
            return true;
        }else
            return false;
    }
    
    public static boolean clockTime(String string){
        if(string.matches("([01][0-9]|2[0-3])(:[0-5][0-9]){2}")){
            return true;
        }else
            return false;
    }
    
}

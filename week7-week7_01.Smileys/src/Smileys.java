
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
       
        printWithSmileys("Mikael");
        printWithSmileys("87.");
        printWithSmileys("\\:D/");
        
    }
    
    private static void printWithSmileys(String characterString){
        String smiley = ":)";
        int strLength = characterString.length();
        
        if(characterString.length() % 2 == 0){
            int length = (strLength + 6)/2;
            
            printTopandBottom(length, smiley);
            System.out.println(smiley + " "+ characterString +" " + smiley);
            printTopandBottom(length, smiley);
            
        }else{
            int length = (strLength + 7)/2;
            
            printTopandBottom(length, smiley);
            System.out.println(smiley + " "+ characterString +"  " + smiley);
            printTopandBottom(length, smiley);
        }
    }
    
    private static void printTopandBottom(int rowLength, String smiley){
        for(int i = 0; i < rowLength; i++){
            System.out.print(smiley);
        }
        System.out.println();
    }
}

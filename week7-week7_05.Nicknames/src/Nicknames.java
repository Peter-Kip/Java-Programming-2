
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        HashMap<String,String> hmap = new HashMap<String,String>();
        
        hmap.put("matti", "mage");
        hmap.put("mikael", "mixu");
        hmap.put("arto", "arppa");
        
        System.out.println(hmap.get("mikael"));
        
    }

}


import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiplagat
 */
public class RingingCentre {
    private  Map<Bird, List<String>> ringingCenter;
    
    public RingingCentre(){
        this.ringingCenter = new HashMap<Bird, List<String>>();
    }
    
    public void observe(Bird bird, String place){
        if(!this.ringingCenter.containsKey(bird)){
            this.ringingCenter.put(bird, new ArrayList<String>());
        }
        this.ringingCenter.get(bird).add(place);
    }
    
    public void observations(Bird bird){
        System.out.print(bird + " observations: ");
        if (!this.ringingCenter.containsKey(bird)) {
            System.out.println("0");
        } else {
            System.out.println(this.ringingCenter.get(bird).size());
            for (String location : this.ringingCenter.get(bird)) {
                System.out.println(location);
            }
        }
    }
}

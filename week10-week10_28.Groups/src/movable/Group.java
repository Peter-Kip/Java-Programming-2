/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kiplagat
 */
public class Group implements Movable{
    private List<Movable> movables;
    
    public Group(){
        this.movables = new ArrayList<Movable>();
    }
    
    public void addToGroup(Movable movable){
        this.movables.add(movable);
    }
    
    public String toString(){
        String list = "";
        for(Movable m : movables){
            list += m.toString() + "\n";
        }
        return list;
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable m : movables){
            m.move(dx, dy);
        }
    }
    
}

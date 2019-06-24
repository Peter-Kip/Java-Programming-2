/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Kiplagat
 */
public class OneThingBox extends Box{
    private Thing thing;
    
    public OneThingBox(){
    }

    @Override
    public void add(Thing thing) {
        if(this.thing != null){
            
        }else{
            this.thing = thing;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(this.thing != null && this.thing.equals(thing)){
            return true;
        }   
        return false;
    }
    
}

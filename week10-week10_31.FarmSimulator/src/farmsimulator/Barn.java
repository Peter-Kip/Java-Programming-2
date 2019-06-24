/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author Kiplagat
 */
public class Barn {
    private MilkingRobot milkingRobot;
    private BulkTank bulkTank;
    
    public Barn(BulkTank tank){
        this.bulkTank = tank;
    }
    
    public BulkTank getBulkTank(){
        return this.bulkTank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.milkingRobot = milkingRobot;
        this.milkingRobot.setBulkTank(bulkTank);
    }
    
    public void takeCareOf(Cow cow){
        if(this.milkingRobot == null){
            throw new IllegalStateException("milking robot hasn't been installed");
        }else{
            this.milkingRobot.milk(cow);
        }
    }
    
    public void takeCareOf(Collection<Cow> cows){
        if(this.milkingRobot == null){
            throw new IllegalStateException("milking robot hasn't been installed");
        }else{
            for(Cow c : cows){
                this.milkingRobot.milk(c);
            }
        }
    }
    
    @Override
    public String toString(){
        return this.bulkTank.toString();
    } 
    
}

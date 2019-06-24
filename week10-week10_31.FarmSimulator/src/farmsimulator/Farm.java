/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.LinkedList;

/**
 *
 * @author Kiplagat
 */
public class Farm implements Alive{
    private String owner;
    private Barn barn;
    private LinkedList<Cow> cows;
    
    public Farm(String owner, Barn barn){
        this.owner = owner;
        this.barn = barn;
        this.cows = new LinkedList<Cow>();
    }
    
    public String getOwner(){
        return this.owner;
    }

    @Override
    public void liveHour(){
        for(Cow c : cows){
            c.liveHour();
        }
    }
    
    public void manageCows(){
        this.barn.takeCareOf(cows);
    }
    
    @Override
    public String toString(){
        return "Farm owner: " + this.owner + 
                "\nCowhouse bulk tank: " + this.barn +
                "\n" + this.cowString();
    }
    
    public String cowString(){
        if(this.cows.isEmpty()){
            return "No couws";
        }else{
            String cowString = "Animals:";
            for(Cow c : cows){
                cowString += "\n        " + c.toString();
            }
            return cowString;
        }
    }

    public void addCow(Cow cow) {
         this.cows.add(cow);
    }
    
   public void installMilkingRobot(MilkingRobot milkingRobot){
       this.barn.installMilkingRobot(milkingRobot);
   }
}

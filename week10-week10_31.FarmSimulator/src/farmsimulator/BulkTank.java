/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Kiplagat
 */
public class BulkTank {
    private double standardCapacity;
    private double volume;
    
    public BulkTank(){
        this.standardCapacity = 2000;
        this.volume = 0;
    }
    
    public BulkTank(double capacity){
        this.standardCapacity = capacity;
        this.volume = 0;
    }
    
    public double getCapacity(){
        return this.standardCapacity;
    }
    
    public double getVolume(){
        return this.volume;
    }
    
    public double howMuchFreeSpace(){
        return this.standardCapacity - this.volume;
    }
    
    public void addToTank(double amount){
        if(this.howMuchFreeSpace() >= amount){
            this.volume += amount;
        }else{
            this.volume = this.standardCapacity;
        }
    } 
    
    public double getFromTank(double amount){
        if(amount >= this.volume){
            this.volume = 0;
            return this.volume;
        }else{
            this.volume -= amount;
        }
        return this.volume;
    }
    
    @Override
    public String toString(){
        return Math.ceil(this.volume) + "/" + Math.ceil(this.standardCapacity);
    }
}

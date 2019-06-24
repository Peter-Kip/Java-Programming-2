/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Kiplagat
 */
public class Thermometer implements Sensor{
    private boolean state;
    
    public Thermometer(){
        this.state = false;
    }

    @Override
    public boolean isOn() {
        return this.state;  
    }

    @Override
    public void on() {
        this.state = true;     
    }

    @Override
    public void off() {
         this.state = false;
    }

    @Override
    public int measure() {
        if(this.isOn() == false){
            throw new IllegalStateException("Thermometer should be On");
        }
        this.on();
       
        return this.Random();
        
    }

    private int Random() {
        Random rand = new Random();
        
        int value = rand.nextInt(30 - (-30)+1)+ -30;
        
        return value; 
    }
    
}

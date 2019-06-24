/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kiplagat
 */
public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor(){
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional){
        this.sensors.add(additional);
    }

    @Override
    public boolean isOn() {
        boolean allON = false;
        
        for(Sensor s : this.sensors){
            if(s.isOn()){
                allON = true;
            } else {
                allON = false;
            }
        } 
        return allON;    
    }

    @Override
    public void on() {
        for(Sensor s : this.sensors){
            s.on();
        }  
    }

    @Override
    public void off() {
        for(Sensor s : this.sensors){
            s.off();
        }
    }

    @Override
    public int measure() {
        int totalReadings = 0;
        int average = 0;
        
        if(this.sensors.size() == 0 || this.isOn() == false ){
            throw new IllegalStateException("sensor must be On");
        }
        for(Sensor s : sensors){
            totalReadings += s.measure();
        }
        
        average = totalReadings/sensors.size();
        this.readings.add(average);
        
        return average;
        
    }
    
    public List<Integer> readings(){
        
        return this.readings; 
    }
    
}

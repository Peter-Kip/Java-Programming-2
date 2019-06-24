/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Kiplagat
 */
public class ContainerHistory {
    private List<Double> history;
    
    public ContainerHistory(){
        this.history = new ArrayList<Double>();
    }
    
    public void add(double situation){
        this.history.add(situation);
    } 
    
    public void reset(){
        this.history.clear();
    }
    
    public double maxValue(){
        double maxValue = 0;
        if(this.history.isEmpty()){
            return maxValue;
        }else{
            for(double d : this.history){
                if(d >= maxValue){
                    maxValue = d;
                }
            }
        }
        return maxValue;
    }
    
    public double minValue(){
        double minValue = 0;
        if(this.history.isEmpty()){
            return minValue;
        }else{
            minValue = this.maxValue();
            for(double d : this.history){
                if(d <= minValue){
                    minValue = d;
                }
            }
        }
        return minValue;
    }
    
    public double average(){
        double average = 0;
        for(double d : this.history){
            average += d;
        }
        average = average/this.history.size();
        
        return average;
    }
    
    public double greatestFluctuation(){
        List<Double> fluctuations = new ArrayList<Double>();
        double greatestFluctuation = 0;
        
        if(this.history.isEmpty() || this.history.size() == 1){
            return greatestFluctuation;
        }else{
            for(int i = this.history.size() - 1; i >= 1; i--){
                double fluctuation = Math.abs(this.history.get(i) - this.history.get(i-1));
                fluctuations.add(fluctuation);
            }
        }
        for(double d : fluctuations){
            if(greatestFluctuation < d){
                greatestFluctuation = d;
            }
        }
        return greatestFluctuation;
    }
    
    public double variance(){
        double varianceSum = 0;
        if(this.history.isEmpty() || this.history.size() == 1){
            return varianceSum;
        }else{
            for(double d : this.history){
                varianceSum += (d - this.average())*(d - this.average());
            }
        }
        double variance = varianceSum/(this.history.size() - 1);
        return variance;
    }
    
    @Override
    public String toString(){
        return this.history.toString();
    }
    
}

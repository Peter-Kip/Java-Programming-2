/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiplagat
 */
public class Calculator {
    private int value;
    
    public Calculator(){
        this.value = 0;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void plus(int n){
        this.value += n;
    }
    
    public void minus(int n){
        this.value -= n;
    }
    
    public void zet(){
        this.value = 0;
    }
}

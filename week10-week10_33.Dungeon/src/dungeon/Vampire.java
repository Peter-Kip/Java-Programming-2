/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Random;

/**
 *
 * @author Kiplagat
 */
public class Vampire {
    private boolean moves;
    private int positionX;
    private int positionY;
    
    public Vampire(boolean moves, int length, int height){
        this.moves = moves;
        this.positionX = new Random().nextInt(length);
        this.positionY = new Random().nextInt(height);
    }
    
    public int getX() {
        return this.positionX;
    }
    
    public int getY() {
        return this.positionY;
    }
    
    public void goUp() {
        if (moves) {
            this.positionY--;
        }
    }
    
    public void goDown() {
        if (moves) {
            this.positionY++;
        }
    }
    
    public void goLeft() {
        if (moves) {
            this.positionX--;
        }
    }
    
    public void goRight() {
        if (moves) {
            this.positionX++;
        }
    }
    
    @Override
    public String toString() {
        return "v " + this.positionX + " " + this.positionY;
    }
    
    @Override
    public boolean equals(Object object){
        if(object == null){
            return false;
        }if(getClass() != object.getClass()){
            return false;
        }
        
        Vampire compared = (Vampire) object;
        if(this.positionX != compared.positionX && this.positionY != compared.positionY){
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.moves ? 1 : 0);
        hash = 29 * hash + this.positionX;
        hash = 29 * hash + this.positionY;
        return hash;
    }
}

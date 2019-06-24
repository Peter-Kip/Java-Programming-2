/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author Kiplagat
 */
public class Player {
    private int moves;
    private int positionX;
    private int positionY;
    
    public Player(int moves){
        this.moves = moves;
        this.positionX = 0;
        this.positionY = 0;
    }
    
    public int getX(){
        return this.positionX;
    }
    
    public int getY(){
        return this.positionY;
    }
    
    public int getMoves(){
        return this.moves;
    }
    
    public void decreamentMoves(){
        this.moves--;
    }
    
    public void goUp(){
        if(this.positionY > 0){
            this.positionY--;
        }
    }
    
    public void goDown(int height){
        if(this.positionY < height - 1){
            this.positionY++;
        }
    }
    
    public void goLeft(){
        if(this.positionX > 0){
            this.positionX--;
        }
    }
    
    public void goRight(int length){
        if(this.positionX < length - 1){
            this.positionX++;
        }
    }
    
    @Override
    public String toString(){
        return "@ " + positionX + " " + positionY;
    }
    
}

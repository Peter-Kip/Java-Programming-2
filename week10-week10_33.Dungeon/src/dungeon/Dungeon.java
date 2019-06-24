/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Scanner;

/**
 *
 * @author Kiplagat
 */
public class Dungeon {
    private int lenght;
    private int height;
    private int numOfVampires; 
    private boolean vampiresMove;
    private Player player;
    private Vampires vampires;
    private Scanner reader;
    
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
        this.lenght = length;
        this.height = height;
        this.numOfVampires = vampires;
        this.vampiresMove = vampiresMove;
        this.player = new Player(moves);
        this.vampires = new Vampires(vampires, vampiresMove, height, length);
        this.reader = new Scanner(System.in);
    }
    
    public void run(){
        while(true){
            if(this.vampires.isEmpty()) {
                System.out.println("YOU WIN");
                break;
            } else if (player.getMoves() == 0) {
                System.out.println("YOU LOSE");
                break;
            }         
            play();
            String userInput = reader.nextLine();
            move(userInput);
        }
    }
    
        private void play() {
        System.out.println(player.getMoves());
        System.out.println("");
        System.out.println(player);
        System.out.println(vampires);
        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.lenght; x++) {
                if (x == player.getX() && y == player.getY()) {
                    System.out.print("@");
                } else if (vampires.vampireExistsAt(x, y)) {
                    System.out.print("v");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println("");
        }
    }
    
    private void move(String userInput) {
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == 'w') {
                player.goUp();
                vampires.removeVampireAt(player.getX(), player.getY());
            } else if (userInput.charAt(i) == 's') {
                player.goDown(this.height);
                vampires.removeVampireAt(player.getX(), player.getY());
            } else if (userInput.charAt(i) == 'a') {
                player.goLeft();
                vampires.removeVampireAt(player.getX(), player.getY());
            } else if (userInput.charAt(i) == 'd') {
                player.goRight(this.lenght);
                vampires.removeVampireAt(player.getX(), player.getY());
            }
        }
        
        player.decreamentMoves();
        vampires.move();
    }

}


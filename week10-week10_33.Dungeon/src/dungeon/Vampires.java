/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Kiplagat
 */
public class Vampires {
    private ArrayList<Vampire> vampires;
    private int dungeonLength;
    private int dungeonHeight;
    
    public Vampires(int vampires, boolean moves, int height, int length) {
        this.vampires = new ArrayList<Vampire>();
        addVampires(vampires, moves, height, length);
        this.dungeonHeight = height;
        this.dungeonLength = length;
    }
    
    private void addVampires(int vampires, boolean moves, int height, int length){
        for (int i = 0; i < vampires; i++) {
            while (true) {
                Vampire newVampire = new Vampire(moves, height, length);
                if (!this.vampires.contains(newVampire)) {
                    this.vampires.add(newVampire);
                    break;
                }
            }
        }
    }
    
    public boolean vampireExistsAt(int x, int y) {
        for (Vampire vampire : vampires) {
            if ((vampire.getX() == x) && (vampire.getY() == y)) {
                return true;
            }
        }
        return false;
    }
    
    public void removeVampireAt(int x, int y) {
        Vampire vampireToBeRemoved = null;
        for (Vampire vampire : vampires) {
            if ((vampire.getX() == x) && (vampire.getY() == y)) {
                vampireToBeRemoved = vampire;
            }
        }
        vampires.remove(vampireToBeRemoved);
    }
    
    public void move() {
        for (Vampire vampire : vampires) {
            int decision = new Random().nextInt(3);
            if (decision == 0) {
                if ((vampire.getY() > 0) && (!vampireExistsAt(vampire.getX(), vampire.getY() - 1))) {
                    vampire.goUp();
                }
            } else if (decision == 1) {
                if ((vampire.getY() < this.dungeonHeight) && (!vampireExistsAt(vampire.getX(), vampire.getY() + 1))) {
                    vampire.goDown();
                }
            } else if (decision == 2) {
                if ((vampire.getX() > 0) && (!vampireExistsAt(vampire.getX() - 1, vampire.getY()))) {
                    vampire.goLeft();
                }
            } else if (decision == 3) {
                if ((vampire.getX() < dungeonLength) && (!vampireExistsAt(vampire.getX() + 1, vampire.getY()))) {
                    vampire.goRight();
                }
            }
        }
    }
    
    @Override
    public String toString() {
        String vampiresToPrint = "";
        for (Vampire vampire : vampires) {
            vampiresToPrint += vampire.toString() + "\n";
        }
        return vampiresToPrint;
    }
    
    public boolean isEmpty() {
        return vampires.isEmpty();
    }
}

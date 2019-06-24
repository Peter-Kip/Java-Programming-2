
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiplagat
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<Card>();
    }
    
    public void add(Card card){
        cards.add(card);
    }
    
    public void print(){
        for(Card card : cards){
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(cards);
    }

    @Override
    public int compareTo(Hand hand) {
        return this.totalValue() - hand.totalValue();
    }
    
    public int totalValue(){
        int totalValue = 0;
        for(Card c : cards){
            totalValue += c.getValue();
        }
        return totalValue;
    }
    
    public void sortAgainstSuit(){
        Collections.sort(cards, new SortAgainstSuitAndValue());
    }
    
}

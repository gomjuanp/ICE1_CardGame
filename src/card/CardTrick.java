/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Juan Pablo Ordonez Gomez 991745862
 */

import java.util.Scanner;
import java.util.Random;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int value = random.nextInt(12) + 1;
            int suit = random.nextInt(3);
            c.setValue(value);
            c.setSuit(Card.SUITS[suit]);
            magicHand[i] = c;
        }
        
        for (int i=0; i<magicHand.length; i++)
        {
            System.out.println(magicHand[i].getSuit() + " " + magicHand[i].getValue());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.print("Enter a card value (1-13): ");
        int userValue = input.nextInt();
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int userSuit = input.nextInt();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);
        boolean found = false;
        Card luckyCard = new Card();
        
        for (int i = 0; i <magicHand.length; i++){
            
            if(userCard.getValue() == magicHand[i].getValue() && userCard.getSuit() == magicHand[i].getSuit()){
                
                found = true;
                break;
                
            }
            
        }
        
        if(found == true){
            
            System.out.println("Well done, your card is in the magic hand.");
            
        }else if (found == false){
            
            System.out.println("Sorry, your card is not in the magic hand.");
            
        }

        
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
        
    }
    
}

// Bai 6

package hw2_19000258;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardTest {

    private List<Card> cards;

    public CardTest() {
        cards = new ArrayList<Card> ();       
    }

    // Tao 52 quan bai
    private void createCard() {
        for (Suit suit : Suit.values()) {
        	for (Rank rank : Rank.values()) {
                cards.add (new Card(rank, suit));
            }
        }
    }
    
    // Hien thi bo bai
    private void displayCard() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    private void implement() {
    	System.out.println("- TAO 52 QUAN BAI: ");
        createCard();
        displayCard();
        
        System.out.println("\n\n- XAO TRON 52 QUAN BAI: ");
        Collections.shuffle(cards);
        displayCard();
       
        System.out.println("\n\n- BO BAI SAU KHI SAP XEP : ");
        Collections.sort(cards);
        Collections.sort (cards, Card.suitComparator);;
        displayCard();
    }

    public static void main (String[] args) {
    	new CardTest().implement();
    }
}
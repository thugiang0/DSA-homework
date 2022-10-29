// Bai 6

package hw2_19000258;

import java.util.Comparator;

enum Suit {
	hearts(0), 
	diamond(1), 
	clubs(2), 
	spades(3);

    private int value;
    private Suit ( int value ) {
        this.value = value;
    }
    public int getValue () {
        return value;
    }
}

enum Rank { 
	Ace (0),
	Two(1), 
	Three(2), 
	Four(3), 
	Five(4),
	Six(5),
	Seven(6),
	Eight(7),
	Nine(8), 
	Ten(9),
	Jack(10),
	Queen(11),
	King(12);
	
    private int val;
    private Rank(int val) {
        this.val = val;
    }
    public int getVal() {
        return val;
    }
}

public class Card implements Comparable<Card> {
    private Rank rank;
    private Suit suit;

    public static Comparator <Card> suitComparator = new Comparator<Card> () {
                        
        @Override
        public int compare(Card someCard, Card anotherCard) {
            return someCard.rank.getVal() - anotherCard.rank.getVal();
        }
    };

    public Card (Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public int compareTo (Card anotherCard) {
        return this.suit.getValue() - anotherCard.suit.getValue();
    }

    public String toString() {     
        return String.format( "     %1s of %1s", rank, suit);
    }
}

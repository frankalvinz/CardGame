package cardgame;

/**
 * 
 * @author chibueze ekwomadu 28-Jan-2022
 */
public class Card {
    public enum Suit {
        HEARTS, CLUBS, SPADES, DIAMONDS, STAR
      }
    
    public enum Value {
            ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN,
            EIGHT, NINE, TEN, JACK, QUEEN, KING, EMPEROR
       }
    
    private Value value;
    private Suit suit;
    
    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }
    
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    
    //This is a test (I'm Done)
    public void printInfo() {
        System.out.println("I am Ekwomadu Chibueze but my friends call me Eze (ehzay). I am currently enrolled in SDNE at Sheridan College, ON.");
    }
}

package cardgame;

import cardgame.Card.Suit;
import cardgame.Card.Value;
import java.util.Random;
/**
 * 
 * @author chibueze ekwomadu 28-Jan-2022
 */
public class CardHandGenerator {

    public static Card[] generateHand(int numCards,
            Value[] cardValues, Suit[] cardSuits) {
        // We'll use Random to generate random numbers
        Random random = new Random();
        
        Card[] hand = new Card[numCards];

        for (int i = 0; i < hand.length; i++) {
            Card.Value value = cardValues[random.nextInt(cardValues.length)];
            Card.Suit suit = cardSuits[random.nextInt(cardSuits.length)];

            Card card = new Card(value, suit);
            hand[i] = card;
        }
        return hand;
    }
}

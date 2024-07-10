package CardGame;

import java.security.SecureRandom;
import java.util.*;

public class DeckOfCard {
    private List<Card> deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private final SecureRandom random = new SecureRandom();
    public DeckOfCard() {
        String face[] = new String[]{
                "ACE", "DEUCE", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"
        };
        String suite[] = new String[]{"HEARTS", "DIAMONDS", "CLUBS", "SPADES"};
         deck = new ArrayList<>(NUMBER_OF_CARDS);
         for (int i = 0; i <NUMBER_OF_CARDS; i++) {
             deck.add(new Card(face[i%13], suite[i/13]));
         }
    }
    public void shuffle() {
      Collections.shuffle(deck);

    }
    public Card dealCard(){
        if(currentCard < deck.size()){
            return deck.get(currentCard++);
        }else{
            return null;
        }
    }
}

package CardGame;

import java.security.SecureRandom;

public class DeckOfCard {
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private final SecureRandom random = new SecureRandom();
    public DeckOfCard() {
        String face[] = new String[]{
                "ACE", "DEUCE", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"
        };
        String suite[] = new String[]{"HEARTS", "DIAMONDS", "CLUBS", "SPADES"};
         deck = new Card[NUMBER_OF_CARDS];
         for (int i = 0; i <deck.length; i++) {
             deck[i] = new Card(face[i%13], suite[i/13]);
         }
    }
    public void shuffle() {
        currentCard = 0;
        for (int i = 0; i < deck.length; i++) {
            int nextCard = random.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[i];
            deck[i] = deck[nextCard];
            deck[nextCard] = temp;
        }

    }
    public Card dealCard(){
        if(currentCard < deck.length){
            return deck[currentCard++];
        }else{
            return null;
        }
    }
}

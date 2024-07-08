package CardGame;

public class Main {

    public static void main(String[] args) {
        DeckOfCard deck = new DeckOfCard();
        deck.shuffle();

        for (int i = 1; i <= 52; i++) {
            System.out.printf("%-25s",deck.dealCard());
         if(i%4==0){
             System.out.println();
         }
        }
    }
}

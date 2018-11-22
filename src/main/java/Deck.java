import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck;

    public Deck(){
        this.deck = new ArrayList<>();
    }

    public int cardCount() {
        return this.deck.size();
    }

    public void fillDeck(){
        // need to loop through suitTypes
            for(SuitType suit : SuitType.values()){
                // for each suit type loop through the Rank enum
                for(Rank rank : Rank.values()){
                    // make a card with that Rank and that SuitType
                    Card card = new Card(suit, rank);
                    // add it to the deck
                    this.deck.add(card);
                }
            }
    }

    public void shuffleCards() {
        Collections.shuffle(deck);
    }

    // could have an isShuffled method
    // keeps the original deck and checks if the shuffled deck is equal to the new deck.

    public Card dealCard(){
        return this.deck.remove(0);
    }
}

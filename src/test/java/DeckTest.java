import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.cardCount());
    }

    @Test
    public void canFillDeck(){
        deck.fillDeck();
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void canDealCard(){
        deck.fillDeck();
        deck.dealCard();
        assertEquals(51, deck.cardCount());
    }
}

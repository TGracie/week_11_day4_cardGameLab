import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void before() {
        player = new Player("Thomas");
        card = new Card(SuitType.HEARTS, Rank.ACE);
    }

    @Test
    public void playerHasName() {
        assertEquals("Thomas", player.getName());
    }

    @Test
    public void handStartsEmpty() {
        assertEquals(0, player.cardCount());
    }

    @Test
    public void canAddCardToHand() {
        player.addCard(card);
        assertEquals(1, player.cardCount());
    }

}

import static org.junit.Assert.*;
        import org.junit.*;

public class CardTest {

    Card card;
    Card card2;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, Rank.ACE);
        card2 = new Card(SuitType.HEARTS, Rank.QUEEN);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS ,card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.ACE ,card.getRank());
    }
    @Test
    public void queenHasValueTen(){
        assertEquals(10 ,card2.getValueFromEnum());
    }

}
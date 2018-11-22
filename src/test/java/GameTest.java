import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Deck deck;
    Player player1;
    Player player2;
    Player player3;

    @Before
    public void before() {
        deck = new Deck();
        deck.fillDeck();
        game = new Game(deck);
        player1 = new Player("Thomas");
        player2 = new Player("Jen");
        player2 = new Player("Craig");
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);
    }

    @Test
    public void startsWithNoPlayers() {
        assertEquals(3, game.getPlayerCount());
    }

    @Test
    public void canAddPlayers() {
        game.addPlayer(player1);
        game.addPlayer(player2);
        assertEquals(5, game.getPlayerCount());
    }

    @Test
    public void newGameDeal(){
        game.newDeal();
        assertEquals(1, player1.cardCount());
        assertEquals(1, player2.cardCount());
        assertEquals(1, player3.cardCount());
    }

    @Test
    public void gameHasWinner(){
        game.newDeal();
        assertEquals(player2, game.checkWin(player1, player2));
    }

    @Test
    public void threePlayerGameHasWinner(){
        game.newDeal();
        assertEquals(player3, game.checkWin());
    }

}

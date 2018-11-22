import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;

    public Game(Deck deck) {
        this.deck = deck;
        this.players = new ArrayList<>();
    }


    public int getPlayerCount() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void newDeal() {
        for(Player player : players){
            // get card from deck
            Card card = deck.dealCard();
            // add a card to player
            player.addCard(card);
        }
    }
}

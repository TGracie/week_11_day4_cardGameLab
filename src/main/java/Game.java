import java.util.ArrayList;
import java.util.Collections;

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

//    public Player checkWin(Player player1, Player player2){
//        if (player1.handValue() > player2.handValue()){
//            return player1;
//        }else if(player1.handValue()<player2.handValue()){
//            return player2;
//        }else{
//            return null;
//        }
//    }

    public Player checkWin(){
        int leader = players.first().handValue()
        for(Player player : this.players){
//            int leader = player.handValue();
            if (player.handValue() > leader){
                leader = player.handValue();
            }
        }
       // return the player
    }
}

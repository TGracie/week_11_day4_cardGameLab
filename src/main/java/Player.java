import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;
    private String name;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int cardCount() {
        return this.hand.size();
    }

    public void addCard(Card card) {
        this.hand.add(card);
    }
}

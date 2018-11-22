import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck;

    public Deck(){
        this.deck = new ArrayList<>();
    }

    public int cardCount() {
        return this.deck.size();
    }

//    public void fillDeck(){
////        SuitType suit = new SuitType;
////        for (suit : SuitType){
////            Rank rank = new Rank;
//            for(Rank rank : Rank.values()){
//                Card card = new Card(SuitType.CLUBS, rank);
//                this.deck.add(card);
//            }
//        }
////    }

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
}

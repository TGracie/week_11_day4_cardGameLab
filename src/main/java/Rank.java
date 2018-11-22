public enum Rank {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    // fixes a value, cannot be changed
    //eg blackjack, ace king queen = 21. ace ten also = 21
    // if changed value to 11 here first instance is now 31 and bust
    // better to change the value after it's been spat out
    private final int value;

    Rank(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }


}

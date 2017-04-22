package people;

import playing_cards.PlayingCard;
import playing_cards.PlayingCardException;
import playing_cards.PlayingCardHand;

public class Player extends Person {
    // Player Hand
    private PlayingCardHand hand;

    public Player(String input_name, int input_money){
        super(input_name, input_money);
        hand = new PlayingCardHand();
    }

    public PlayingCard addCard(PlayingCard new_card){
        return hand.addCard(new_card);
    }

    public PlayingCard removeCard(int index) throws PersonException {
        try {
            return hand.removeCard(index);
        } catch ( PlayingCardException e ){
            throw new PersonException();
        }
    }

    public PlayingCard getCard(int index) throws PersonException {
        try {
            return hand.getCard(index);
        } catch ( PlayingCardException e ){
            throw new PersonException();
        }
    }

    public int handSize(){
        return hand.getSize();
    }
}

package playing_cards;

import java.util.ArrayList;

public class PlayingCardHand {

    private ArrayList<PlayingCard> cards;

    public PlayingCardHand(){
        cards = new ArrayList<PlayingCard>();
    }

    public PlayingCard addCard(PlayingCard new_card){
        cards.add(new_card);
        return new_card;
    }

    public PlayingCard getCard(int index) throws PlayingCardException {
        if (( index < 0 ) || ( index >= cards.size())){
            throw new PlayingCardException();
        }
        return cards.get(index);
    }

    public PlayingCard removeCard(int index) throws PlayingCardException {
        if (( index < 0 ) || ( index >= cards.size())){
            throw new PlayingCardException();
        }
        return cards.remove(index);
    }

    public int getSize(){
        return cards.size();
    }
}

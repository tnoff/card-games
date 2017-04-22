import java.util.ArrayList;
import java.util.Collections;

public class PlayingCardDeck {
    ArrayList<PlayingCard> card_deck;

    public PlayingCardDeck(){
        // Init basic card deck
        card_deck = new ArrayList<PlayingCard>();

        // temp variable
        PlayingCard new_card;

        for (int rank = 0; rank < 13; rank++){
            for (int suite = 0; suite < 4; suite++){
                try {
                    new_card = new PlayingCard(rank, suite);
                    card_deck.add(new_card);
                    // safe variables so pretty much ignore catch
                } catch (PlayingCardException e){}
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(card_deck);
    }

    public void addPlayingCard(PlayingCard new_card){
        card_deck.add(new_card);
    }

    public PlayingCard getPlayingCard(int index) throws PlayingCardException {
        if ((index < 0) || (index > card_deck.size())) {
            throw new PlayingCardException();
        }
        return card_deck.get(index);
    }

    public PlayingCard removePlayingCard(int index) throws PlayingCardException {
        if ((index < 0) || (index > card_deck.size())) {
            throw new PlayingCardException();
        }
        return card_deck.remove(index);
    }

    public int getDeckSize(){
        return card_deck.size();
    }

    public String toString(){
        String total_string = "";
        for (int x = 0; x < card_deck.size(); x++){
            total_string = total_string + card_deck.get(x);
            if ( x != card_deck.size() - 1){
                total_string = total_string + "--";
            }
        }
        return total_string;
    }
}

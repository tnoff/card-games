package playing_cards;

public class PlayingCard {
    private int suite;
    private int rank;

    private String[] card_ranks = {"2", "3", "4", "5", "6", "7", "8", "9",
                                   "10", "J", "Q", "K", "A"};

    private String[] card_suites = {"Spades", "Clubs", "Diamonds", "Hearts"};

    public PlayingCard(int input_rank, int input_suite) throws PlayingCardException {
        // Rank of card, 0 - 12 integer
        // Suite of card, 0 - 3 integer
        if ((input_rank < 0 ) || (input_rank > 12)){
            throw new PlayingCardException();
        }
        if ((input_suite < 0) || (input_suite > 3)){
            throw new PlayingCardException();
        }
        rank = input_rank;
        suite = input_suite;
    }

    public int getRank(){
        return rank;
    }

    public int getSuite(){
        return suite;
    }

    public String toString(){
        return "" + card_ranks[rank] + "-" + card_suites[suite];
    }
}

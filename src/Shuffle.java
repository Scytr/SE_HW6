import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
    private ArrayList<Integer> cards;
    private boolean discard;

    public Shuffle(boolean discard) {
        this.discard = discard;
        this.cards = new ArrayList<>();

        for(int i = 1; i <= 100; i++) {
            cards.add(i);
        }
    }

    public Shuffle() {
        this(false);
    }

    private void shuffleCards() {
        Collections.shuffle(cards);
    }

    public int pickCard() {
        shuffleCards();

        if(discard) {
            return cards.remove(0);
        }
        return cards.get(0);
    }
}

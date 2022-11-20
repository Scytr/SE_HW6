public class BetMore {
    private static Shuffle s = new Shuffle(false);

    public static int play() {
        return s.pickCard();
    }

    public static Player findWinner(Player p1, Player p2) {
        // Unclear what should happen if there is no winner
        return p1.getCard() == p2.getCard() ? null : p1.getCard() > p2.getCard() ? p1 : p2;
    }
}

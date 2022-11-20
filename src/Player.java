import java.util.Scanner;

public class Player {
    private final boolean isComputer;
    private static final int MAX_PICKS = 5;
    private int picks;
    private int card;
    private static final Scanner scanner = new Scanner(System.in);

    public Player(boolean isComputer) {
        this.isComputer = isComputer;
    }

    public int start() {
        if(isComputer) {
            card = play();
            System.out.printf("Computer Card: %s\n", card);
        } else {
            picks = 0;
            boolean next = true;
            while (picks < MAX_PICKS && next) {
                card = play();
                System.out.printf("Current Card: %s; Attempt %s/5", card, picks);

                if(picks < MAX_PICKS) {
                    System.out.print("; New Card? (Y/N)\n");
                    String ans = getAnswer();
                    if ("n".equalsIgnoreCase(ans)) {
                        next = false;
                    }
                } else {
                    System.out.println();
                }
            }
        }
        return card;
    }

    private int play() {
        picks++;
        return BetMore.play();
    }

    private String getAnswer() {
        String ans = scanner.next();
        while(true) {
            if("n".equalsIgnoreCase(ans) || "y".equalsIgnoreCase(ans))
                return ans;
            System.out.println("Invalid Answer (Y/N)");
            ans = scanner.next();
        }
    }

    public int getCard() {
        return card;
    }

    public boolean isComputer() {
        return isComputer;
    }
}

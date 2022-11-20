public class GameChair {
    public GameChair() {
        Player computer = new Player(true);
        Player player = new Player(false);

        computer.start();
        player.start();

        Player winner = BetMore.findWinner(computer, player);

        if(winner == null) {
            System.out.println("There is no winner");
        } else {
            System.out.printf("The winner is the %s\n", winner.isComputer() ? "Computer" : "Player");
        }
    }
}

public class SnakeAndLadder {
    public static final int IS_SNAKE = 1;
    public static final int IS_LADDER = 2;
    public static final int WINNING_POSITION = 100;

    static int diceCount = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder project");

        int player1Position = 0;
// int player2Position = 0;
        while (player1Position < WINNING_POSITION) {
            ++diceCount;
            player1Position = getPosition(player1Position);
        }

    }

    private static int getPosition(int position) {
        int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        int option = (int) (Math.floor(Math.random() * 10) % 3);
        if (option == IS_SNAKE) {
            System.out.println("Snake for the player");

            if (position - diceNumber > 0) {
                position -= diceNumber;
            }
        } else if (option == IS_LADDER) {
            System.out.println("Ladder for the player");

            if (position + diceNumber <= 100) {
                position += diceNumber;
            }
        } else {
            System.out.println("No play for the player");
        }
        System.out.println("dice count " + diceCount);
        System.out.println("player1Position " + position);
        return position;
    }
}
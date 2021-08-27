public class SnakeAndLadder {
    static int diceCount = 0;
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder program");
        int startPosition = 0;
        while (startPosition != 100) {
            diceCount++;
            int dieRoll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
            System.out.println("Die Rolled:" + dieRoll);
            int checkOption = (int) Math.floor(Math.random() * 10) % 3;
            if (checkOption == 0) {
                System.out.println("No Play");
            } else if (checkOption == 1) {
                System.out.println("Ladder Comes");
                if (startPosition + dieRoll <= 100) {
                    startPosition += dieRoll;
                } else if (startPosition + dieRoll > 100) {
                    continue;
                }
            } else {
                System.out.println("Snake Comes");
                if ((startPosition - dieRoll) < 0) {
                    startPosition = 0;
                } else {
                    startPosition -= dieRoll;
                }
            }
            System.out.println(dieRoll);
            System.out.println("Player Position After Dice Roll " + startPosition);
        }
        System.out.println("Number Of times Dice Roll To Win " + diceCount);
    }
}
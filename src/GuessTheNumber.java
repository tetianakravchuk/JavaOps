import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Random rand = new Random();

        int randomInteger;
        randomInteger = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        while (true) {


            System.out.print("User Input:");
            int userInput = scanner.nextInt();

            if (userInput == randomInteger) {
                System.out.println("Congratulation, you guessed");
                break;
            } else if (userInput > randomInteger) {
                System.out.println("Guess Lower");
            } else {
                System.out.println("Guess Higher");
            }
        }
    }
}

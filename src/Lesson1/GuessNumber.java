package Lesson1;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random rand = new Random();

        int randomNumber = rand.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("User Input:");
            int userInput = scanner.nextInt();

            if (userInput == randomNumber) {
                System.out.println("Congratulation, you guessed");
                break;
            } else if (userInput > randomNumber) {
                System.out.println("Guess Lower");
            } else {
                System.out.println("Guess Higher");
            }
        }
    }
}

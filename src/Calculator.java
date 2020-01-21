import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int number1;
        int number2;
        String operation;
        long result = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        number1 = input.nextInt();

        System.out.println("Enter operation");
        operation = input.next();

        System.out.println("Enter the second number");
        number2 = input.nextInt();

        if (operation.equals("+")) {
            System.out.println("Your answer is " + (number1 + number2));
        } else if (operation.equals("-")) {
            System.out.println("Your answer is " + (number1 - number2));
        } else if (operation.equals("/")) {
            System.out.println("Your answer is " + (number1 / number2));
        } else if (operation.equals("*")) {
            System.out.println("Your answer is " + (number1 * number2));
        } else if (operation.equals("^")) {
            while (number2 != 0) {
                result *= number1;
                --number2;
            }
            System.out.println("Result is " + result);
        } else if (operation.equals("%")) {
            System.out.println("Your answer is " + (number1 % number2));
        } else {
            System.out.println("Wrong selection");
        }
    }
}

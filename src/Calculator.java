import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int number1;
        int number2;

        String operation;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        number1 = input.nextInt();

        System.out.println("Enter the second number");
        number2 = input.nextInt();

        System.out.println("Enter operation");
        operation = input.next();

        if (operation.equals("+")) {
            System.out.println("Your answer is " + (number1 + number2));
        } else if (operation.equals("-")) {
            System.out.println("Your answer is " + (number1 - number2));
        } else if (operation.equals("/")) {
            System.out.println("Your answer is " + (number1 / number2));
        } else if (operation.equals("*")) {
            System.out.println("Your answer is " + (number1 * number2));
        } else if (operation.equals("^")) {
            int temp = number1;
            for (int i = 1; i < number2; i++){
                temp = temp * temp;
            }
            System.out.println("Result of " + number1+ " power "+ number2 + " is " + temp);
        } else if (operation.equals("%")) {
            System.out.println("Your answer is " + (number1 % number2));
        } else {
            System.out.println("Wrong selection");
        }
    }
}

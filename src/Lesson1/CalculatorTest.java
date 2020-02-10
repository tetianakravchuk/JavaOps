package Lesson1;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int number = 2;
        String operation;
        switch (number) {

            case 1:
                operation = "Введите первое число: 2";
                break;
            case 2:
                operation = "Введите знак математической операции: ^";
                break;
            case 3:
                operation = "Введите второе число: 10";
                break;
            default:
                operation = "Invalid entry";
                break;
        }
        System.out.println(operation);
    }
}

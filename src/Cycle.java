public class Cycle {
    public static void main(String[] args) {
        // Выведите на консоль с помощью цикла for все числа от [0, 20]
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        // Выведите на консоль с помощью цикла while все числа от [6, -6] (шаг итерации равен 2)
        int value = 6;
        while (value >= -6) {
            System.out.println(value);
            value = value - 2;
        }

        // Выведите на консоль с помощью цикла do-while сумму всех нечетных чисел от [10, 20]
        int sum = 0;
        int i = 10;
        do {
            if (i % 2 != 0)
                sum = sum +i;
            i ++;
        } while (i <= 20);
        {
            System.out.println("Sum = " + sum);

        }
    }}



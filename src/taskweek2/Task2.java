package taskweek2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int min = num1 - num2;
        int mul = num1 * num2;
        int dif = num1 / num2;

        System.out.println("Cумма чисел: " + sum);
        System.out.println("Разность чисел: " + min);
        System.out.println("Произведение чисел: " + mul);
        System.out.println("Частное чисел: " + dif);

    }
}

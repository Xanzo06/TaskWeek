package taskweek7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
            System.out.println(i);
        }
        System.out.println("Сумма всех чисел: " + sum);
        scanner.close();
    }
}

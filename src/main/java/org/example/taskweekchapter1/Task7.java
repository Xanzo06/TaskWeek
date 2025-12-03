package org.example.taskweekchapter1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        int sumEven = 0;
        int sumOdd = 0;
        int sumMult = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else{
                sumOdd += i;
            }
            if (i % 3 == 0){
                sumMult += i;
            }
                System.out.println(i);
        }
        System.out.println("Сумма всех четных чисел: " + sumEven);
        System.out.println("Сумма всех нечетных чисел: " + sumOdd);
        System.out.println("Сумма всех кратных 3 чисел: " + sumMult);
        scanner.close();
    }
}

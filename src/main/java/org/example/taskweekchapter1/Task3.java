package org.example.taskweekchapter1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Число " + num + " чётное.");
        } else {
            System.out.println("Число " + num + " нечётное.");
        }
        if (num > 0) {
            System.out.println("Число " + num + " положительное.");
        } else if (num < 0) {
            System.out.println("Число " + num + " отрицательное.");
        } else if (num == 0) {
            System.out.println("Число " + num + " равно 0");
        }
        if (num % 3 == 0) {
            System.out.println("Число " + num + " кратно 3");
        } else if (num % 5 == 0) {
            System.out.println("Число " + num + " кратно 5");
        } else if (num % 7 == 0) {
            System.out.println("Число " + num + " кратно 7");
        }
        scanner.close();
    }


}






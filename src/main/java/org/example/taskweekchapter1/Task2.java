package org.example.taskweekchapter1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        double average = (num1 + num2) / 2.0;

        int sum = num1 + num2;
        int min = num1 - num2;
        int mul = num1 * num2;
        int dif = num1 / num2;

        System.out.println("Cумма чисел: " + sum);
        System.out.println("Разность чисел: " + min);
        System.out.println("Произведение чисел: " + mul);
        System.out.println("Частное чисел: " + dif);

        if (num1 > num2){
            System.out.println("Число num1 больше");
        }else if (num1 < num2){
            System.out.println("Число num2 больше");
        }
        if (num1 % num2 == 0){
            System.out.println(num1 + " делится на " + num2 + " без остатка");
        }else{
            System.out.println(num1 + " не делится на " + num2 + " без остатка");
        }
        System.out.println("Среднее арифметическое: " + average);
        scanner.close();



    }
}

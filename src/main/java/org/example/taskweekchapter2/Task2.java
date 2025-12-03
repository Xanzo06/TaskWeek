package org.example.taskweekchapter2;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int target = random.nextInt(100) + 1;
        int count = 0;
        int guess = 0;
        while (guess != target){
            System.out.println("Введите ваше число: ");
            guess = scanner.nextInt();
            count++;
            if (guess < target){
                System.out.println("Слишком мало!");
            } else if (guess > target){
                System.out.println("Слишком много");
            } else if (guess == target){
                System.out.println("Вы угадали, загаданное число: " + guess + "\nЧисло попыток: " + count);
            }

        }
    }

}

package org.example.taskweekchapter1;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите значения: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int avgsum = 0;
        int posSum = 0;
        int negSum = 0;
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
            if (arr[i] > 0) {
                posSum++;
            } else {
                negSum++;
            }
        }
        for (int num : arr) {
            avgsum += num;
        }

        double average = (double) avgsum / arr.length;


        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("Максимальное значение массива: " + max);
        System.out.println("Минимальное значение массива: " + min);
        System.out.println("Среднее арифметическое: " + average);
        System.out.println("Количество положительных чисел: " + posSum);
        System.out.println("Количество отрицательных чисел: " + negSum);
        System.out.println("Сумма всех элементов: " + sum);
        scanner.close();
    }
}
package taskweek8;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int max = arr[0];
        System.out.println("Введите значения: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("Максимальное значение массива: " + max);
        scanner.close();
    }
}
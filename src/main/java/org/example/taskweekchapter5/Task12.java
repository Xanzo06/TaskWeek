package org.example.taskweekchapter5;


import java.util.Arrays;
import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
        Task12 task12 = new Task12();
        int[] arr = new int[1_000_000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(1000);
        }
            System.out.println(task12.min(arr));

        long start = System.nanoTime();
        task12.min(arr);
        long end = System.nanoTime();
        System.out.println("Время выполнения: " + (end - start) / 1_000_000 + " мс");

    }

    public int min(int[] values) {
        int minValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if (minValue >= values[i]) {
                minValue = values[i];
            }
        }
        int finalMinValue = minValue;
        assert Arrays.stream(values).allMatch(value -> finalMinValue <= value) : "Найден элемент меньше минимального";

        return minValue;
    }
}


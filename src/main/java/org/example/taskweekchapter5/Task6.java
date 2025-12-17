package org.example.taskweekchapter5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Task6 task3 = new Task6();
        System.out.println(task3.printTask6("txt.task1"));
        System.out.println(task3.printTask6V2("txt.task1"));


    }

    public ArrayList<Double> printTask6(String filename) {
        ArrayList<Double> doubleArr = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] arr = line.split("\\s+");
                for (String str : arr) {
                    if (!str.isEmpty()) {
                        try {
                            double value = Double.parseDouble(str);
                            doubleArr.add(value);

                        } catch (NumberFormatException e) {
                            System.out.println("Неверный формат чисел: " + str);
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(" Файл не найден" + e.getMessage());
        }
        return doubleArr;
    }

    public ArrayList<Double> printTask6V2(String filename) {
        ArrayList<Double> doubleArr = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] arr = line.split("\\s+");
                for (String str : arr) {
                    if (!str.isEmpty()) {
                        try {
                            double value = Double.parseDouble(str);
                            doubleArr.add(value);

                        } catch (NumberFormatException e) {
                            System.out.println("Неверный формат чисел: " + str);
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден" + e.getMessage());
        } finally {
            if (scanner != null) {
                try {
                    scanner.close();
                } catch (Exception e) {
                    System.out.println("Ошибка закрытия сканнера: " + e.getMessage());
                }
            }
        }
        return doubleArr;
    }
}



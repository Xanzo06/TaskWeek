package org.example.taskweekchapter5.Task8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

public class Task8 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Task8 task8 = new Task8();

        try(Lock guard = new Lock(lock)) {
            System.out.println(task8.printTask6V2("txt.task1"));
        }catch (Exception e){
            System.out.println("Ошибка: " + e.getMessage());
        }

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


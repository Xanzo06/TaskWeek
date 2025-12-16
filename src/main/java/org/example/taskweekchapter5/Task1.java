package org.example.taskweekchapter5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        Task1 task1 = new Task1();
    task1.printResultNotException("txt.task1");


    }

    public ArrayList<Double> readValues(String filename) {
        File file = new File(filename);
        if (!file.exists()){
            return null;
        }
        ArrayList<Double> numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                String[] str = line.split("\\s+");


                for (String strNum : str) {
                    if (!strNum.isEmpty()) {
                        try {
                            double value = Double.parseDouble(strNum);
                            numbers.add(value);
                        } catch (NumberFormatException e) {
                            return null;
                        }
                    }
                }
            }
        } catch (Exception e){
            return null;
        }
        return numbers;
    }
    public double sumOfValues(String filename) {
        ArrayList<Double> values = readValues(filename);
        if (values == null){
            return Double.NaN;
        }
        double sum = 0.0;
        for (Double value : values){
            sum += value;
        }
        return sum;
    }

    public void printResult(String filename){
        try {
            ArrayList<Double> arr = readValues(filename);
            System.out.println(arr);

            double value = sumOfValues(filename);
            System.out.println("Сумма значений: "+ value);

        } catch (IllegalArgumentException e){
            System.out.println("Ошибка в формате числа: " + e.getMessage());
        }
    }
    public void printResultNotException(String filename) throws FileNotFoundException {
        ArrayList<Double> arr = readValues(filename);
        if (arr == null){
            System.out.println("Ошибка: не удалось прочитать файл");
            return;
        }
        System.out.println(arr);

        double value = sumOfValues(filename);
        if (Double.isNaN(value)){
            System.out.println("Ошибка: не удалсть прочитать сумму");
            return;
        }
        System.out.println("Сумма значений: "+ value);

    }
}
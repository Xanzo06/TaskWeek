package org.example.taskweekchapter5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.processFile("txt.task1", "txt.task2");

    }

    public boolean processFile(String inputFile, String outputFile) {
        Scanner scanner = null;
        PrintWriter printWriter = null;
        try {
            scanner = new Scanner(new File(inputFile));
            printWriter = new PrintWriter(outputFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] str = line.split("\\s+");

                for (String strNum : str) {
                    if (!strNum.isEmpty()) {
                        try {
                            double value = Double.parseDouble(strNum);
                            printWriter.println(value);
                        } catch (NumberFormatException e) {

                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            return false;
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            if (printWriter != null) {
                printWriter.close();
            }
        }
        return true;
    }
}
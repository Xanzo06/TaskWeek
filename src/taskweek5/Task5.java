package taskweek5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = scanner.nextLine();
        int count = 0;
        for (int i = 0; i <= word.length(); i++){
            count = i;
        }
        System.out.println("Количество букв в слове: " + word + ": " + count);
        scanner.close();
    }
}

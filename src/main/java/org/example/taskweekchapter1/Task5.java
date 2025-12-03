package org.example.taskweekchapter1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String vowels = "аеёиоуыэюяaeiouy";
        String word = scanner.nextLine();
        int resultVowels = 0;
        int lengthWord = word.length();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            char lowerChar = Character.toLowerCase(c);
            if (vowels.indexOf(lowerChar) != -1) {
                resultVowels++;
            }
        }
        if (!word.isEmpty()) {
            char firstWord = word.charAt(0);
            char lastWord = word.charAt(word.length() - 1);
            System.out.println("Первая буква в строке: " + firstWord);
            System.out.println("Последняя буква в строке: " + lastWord);
        }
        String lower = word.toLowerCase();
        String upper = word.toUpperCase();


        System.out.println("Длина строки " + word + ": " + lengthWord + " букв.");
        System.out.println("Количество гласных в строке: " + resultVowels);
        System.out.println("Строка в нижнем регистре: " + lower);
        System.out.println("Строка в верхнем регистер: " + upper);
        scanner.close();
    }


}

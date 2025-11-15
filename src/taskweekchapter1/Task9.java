package taskweekchapter1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String word = scanner.nextLine();
        StringBuilder builder = new StringBuilder(word);
        builder.reverse();
        String result = builder.toString();
        Set<Character> set = new HashSet<>();
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c))
                set.add(c);
        }

        if (isPalindrome(word)) {
            System.out.println("Строка " + word + " является палиндромом");
        } else {
            System.out.println("Строка " + word + " не является палиндромом");
        }

        System.out.println("Строка: " + word);
        System.out.println("Перевернутая строка: " + result);
        System.out.println("Количество различных букв в слове: " + set.size());
        scanner.close();
    }

    public static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {

            while (left < right && !Character.isLetter(text.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetter(text.charAt(right))) {
                right--;
            }
            while (left < right && Character.toLowerCase(text.charAt(left)) != Character.toLowerCase(text.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

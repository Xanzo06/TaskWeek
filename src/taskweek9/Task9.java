package taskweek9;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String word = scanner.nextLine();
        StringBuilder builder = new StringBuilder(word);
        builder.reverse();
        String result = builder.toString();
        System.out.println(result);
        scanner.close();
    }
}

package taskweek6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(n * i);
            scanner.close();
        }

    }

}




package taskweekchapter1;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 100;
        while (true) {
            Random random = new Random();
            int secretNumber = random.nextInt(n) + 1;
            System.out.println("Угадайте число от 1 до " + n);
            int guess = scanner.nextInt();
            scanner.nextLine();
            int tr = 1;
            boolean guessed = false;
            for (int i = 1; i < 10; i++) {
                if (secretNumber > guess) {
                    System.out.println("Загаднное число больше, ещё попытка: ");
                    System.out.println("Угадайте число от 1 до " + n);
                    guess = scanner.nextInt();
                    scanner.nextLine();
                    tr++;
                } else if (secretNumber < guess) {
                    System.out.println("Загаданное число меньше, ещё попытка: ");
                    System.out.println("Угадайте число от 1 до " + n);
                    guess = scanner.nextInt();
                    scanner.nextLine();
                    tr++;
                } else if (secretNumber == guess) {
                    System.out.println("Поздравляю, вы угадали число: " + secretNumber);
                    guessed = true;
                    break;
                }
            }
            if (!guessed) {
                System.out.println("Вы не угадали, загаданное число было: " + secretNumber);
            }
            System.out.println("Количество попыток: " + tr);
            System.out.println("Хотите сыграть ещё ?");

            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("Нет")) {
                break;
            } else if (word.equalsIgnoreCase("Да")) ;
        }
        scanner.close();
    }
}


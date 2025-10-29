package taskweek10;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int n = 50;
      Random random = new Random();
      int secretNumber = random.nextInt(n) + 1;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Угадайте число от 1 до " + n);
      int guess = scanner.nextInt();
      if (secretNumber == guess){
          System.out.println("Вы угадали! " + secretNumber);
      }else{
          System.out.println("Вы не угадали " + secretNumber);
      }


    }
}

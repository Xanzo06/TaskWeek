package taskweek4;


import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму в долларах: ");
        double dollar = scanner.nextDouble();
        double rubToUsd = 90;

        double rub = dollar * rubToUsd;

        System.out.println("Сумма в рублях: " + rub );

    }
}

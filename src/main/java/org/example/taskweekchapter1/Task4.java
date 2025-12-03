package org.example.taskweekchapter1;


import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Выбирете исходную валюту (Например RUB, USD, EUR): ");
        String currency = scanner.nextLine();
        double baseAmount = 0;
        double usdToRub = 90;
        double eurToRub = 92;

        if (currency.equals("USD")) {
            baseAmount = n * usdToRub;
        } else if (currency.equals("EUR")) {
            baseAmount = n * eurToRub;
        } else if (currency.equals("RUB")) {
            baseAmount = n;
        }
        double result = 0;

        System.out.println("Выберите целевую валюту (Например RUB, USD, EUR): ");
        String targetCurrency = scanner.nextLine();
        if (targetCurrency.equals("USD")) {
            result = baseAmount / usdToRub;
        } else if (targetCurrency.equals("EUR")) {
            result = baseAmount / eurToRub;
        } else if (targetCurrency.equals("RUB")) {
            result = baseAmount;
        }
        System.out.println("Результат: " + result +  targetCurrency);
        scanner.close();

    }
}

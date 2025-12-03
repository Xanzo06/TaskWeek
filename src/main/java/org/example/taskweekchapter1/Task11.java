package org.example.taskweekchapter1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму кредита сложного процента: ");
        BigDecimal deposit = new BigDecimal(scanner.nextLine());
        System.out.println("Введите процент: ");
        BigDecimal percent = new BigDecimal(scanner.nextLine());
        System.out.println("Введите срок в годах: ");
        int years = scanner.nextInt();
        System.out.println("Введите частоту выплат (Например 1 - раз в год, 4 - каждые 3 месяца, 12 - каждый месяц");
        int accrual = scanner.nextInt();

        BigDecimal percentPerPeriod = percent.divide(new BigDecimal(accrual), 10, RoundingMode.HALF_UP);
        BigDecimal rate = new BigDecimal("1").add(percentPerPeriod.divide(new BigDecimal("100"), 10, RoundingMode.HALF_UP));
        BigDecimal dep = deposit;
        int totalPeriod = years * accrual;


        for (int i = 1; i <= totalPeriod; i++) {
            deposit = deposit.multiply(rate);
            System.out.println("После " + i + " месяца " + deposit.setScale(2, RoundingMode.HALF_UP));
        }
        BigDecimal dep1 = deposit.subtract(dep);
        BigDecimal sumCredit = deposit.multiply(percent)
                .divide(new BigDecimal("100"), 10, RoundingMode.HALF_UP)
                .multiply(new BigDecimal(years));

        BigDecimal difference = dep1.subtract(sumCredit);
        System.out.println("Переплата обычного процента: " + sumCredit.setScale(2, RoundingMode.HALF_UP));
        System.out.println("Переплата cложного процента: " + dep1.setScale(2, RoundingMode.HALF_UP));
        System.out.println("Разница переплат: " + difference.setScale(2, RoundingMode.HALF_UP));
        scanner.close();

    }

}

package taskweekchapter1;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String csv = scanner.nextLine();
        String[] records = csv.split(";");
        int totalAge = 0;
        int count = records.length;
        int maxSalary = 0;
        int engineer = 0;
        int manager = 0;


        for (String record : records) {
            String[] parts = record.split(",");
            int age = Integer.parseInt(parts[1]);
            int salary = Integer.parseInt(parts[3]);

            if (maxSalary < salary) {
                maxSalary = salary;
            }
            totalAge += age;
        }
        for (String record : records) {
            String[] parts = record.split(",");
            String profession = parts[2];

            if (profession.equals("инженер")) {
                engineer++;
            } else if (profession.equals("менеджер")) {
                manager++;
            }
        }
        String mostPopularProfession;
        if (engineer >= manager) {
            mostPopularProfession = "инженер";
        } else {
            mostPopularProfession = "менеджер";

        }
        double avgAge = (double) totalAge / count;
        System.out.println("Общие количество записей: " + count);
        System.out.println("Средний возраст: " + avgAge);
        System.out.println("Максимальная зарплата: " + maxSalary);
        System.out.println("Самая популярная профессия: " + mostPopularProfession);
        scanner.close();
    }
}

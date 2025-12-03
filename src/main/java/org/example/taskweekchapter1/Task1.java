package org.example.taskweekchapter1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Имя: ");
        String name = scanner.nextLine();
        System.out.println("Фамилия: ");
        String surname = scanner.nextLine();
        System.out.println("Сколько лет: ");
        int age = scanner.nextInt();
        System.out.println("Привет! "  + name + " " + surname +  " Тебе " + age + "\nДобро пожаловать в Java!");
        scanner.close();

    }
}
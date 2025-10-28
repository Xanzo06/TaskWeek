package taskweek;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как твоё имя ?");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!\nДобро пожаловать в Java!");

    }
}
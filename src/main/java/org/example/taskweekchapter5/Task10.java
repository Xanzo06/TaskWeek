package org.example.taskweekchapter5;

public class Task10 {
    public static void main(String[] args) {
        factorial(10);

    }

    public static int factorial(int n) {
        System.out.println("Вызов факториала: " + n);
        if (n <= 1) {
            new Exception("Стек-трейс").printStackTrace();
            return 1;
        }
        return n * factorial(n - 1);
    }
}

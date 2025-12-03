package org.example.taskweekchapter2;

public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Person person = new Person("Боря");
        System.out.println("Имя: " + person.getName());

        person.setName("Миша");
        System.out.println("Новое имя: " + person.getName());
    }
}

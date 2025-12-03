package org.example.taskweekchapter2;

public class Student {
    public String name;
    public int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void haveBirthday(){
         this.age++;
    }

    public static void main(String[] args) {
        Student student = new Student("Борис", 22);
        System.out.println("Имя Студента: " + student.getName() + " ; " + "Возраст: " + student.getAge());
        student.haveBirthday();
        System.out.println("После дня рождения возраст: " + student.getAge());
    }
}

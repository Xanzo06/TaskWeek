package org.example.taskweekchapter2.models;

public class Teacher {
    public String name;
    public String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void teach() {
        System.out.println(name + " преподаёт " + subject);
    }
}

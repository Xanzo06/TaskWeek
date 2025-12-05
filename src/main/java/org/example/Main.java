package org.example;

import org.example.taskweekchapter4.Point;
import org.example.taskweekchapter2.Point2;
import org.example.taskweekchapter3.IntSequence;
import org.example.taskweekchapter3.IntSequenceUtils;
import org.example.taskweekchapter3.ListUtils;
import org.example.taskweekchapter3.RunUtil;
import org.example.taskweekchapter3.DataAnalyzer;
import org.example.taskweekchapter3.Measurable;
import org.example.taskweekchapter3.Employee;
import org.example.taskweekchapter2.Invoice;
import org.example.taskweekchapter2.math.utils.Calculator;
import org.example.taskweekchapter2.models.Teacher;
import org.example.taskweekchapter4.Circle;
import org.example.taskweekchapter4.Color;
import org.example.taskweekchapter4.LabeledPoint;
import org.example.taskweekchapter4.Line;
import org.example.taskweekchapter4.Rectangle;


import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Учитель:");
//        Teacher teacher = new Teacher("Борис Борисович", "Физкультура");
//        teacher.teach();
//        System.out.println();
//        int a = 10;
//        int b = 5;
//        System.out.println("Калькулятор:");
//        System.out.println("Сложение: " + Calculator.add(a, b));
//        System.out.println("Вычитание: " + Calculator.subtract(a, b));
//        System.out.println("Умножение: " + Calculator.multiply(a, b));
//        System.out.println("Деление: " + Calculator.divide(a, b));
//        System.out.println();
//
//        Point point1 = new Point(3, 4).translate(1, 3).scale(0.5);
//        System.out.println("Координаты после: " + point1);
//
//        System.out.println();
//
//        Point2 point2 = new Point2(3, 4);
//        System.out.println("До: " + point2);
//
//        point2.translate(1, 3);
//        System.out.println("После translate: " + point2);
//        point2.scale(0.5);
//        System.out.println("После scale: " + point2);
//        System.out.println();
//        Invoice invoice = new Invoice(123, "ООО Канцтовары", "Борисов Б.Б");
//        invoice.addItem("Ручка", 2, 50.0);
//        invoice.addItem("Блокнот", 1, 100.0);
//
//        invoice.printInvoice();

        //Task1, Task2
        Measurable[] employees = {
                new Employee("Николай", 1000),
                new Employee("Борис", 2000),
                new Employee("Антон", 3000)
        };

        double avg = DataAnalyzer.average(employees);

        Measurable largest = DataAnalyzer.largest(employees);

        if (largest != null) {
            Employee emp = (Employee) largest;
            System.out.println("Сотрудник с самой высокой зарпалатой: " + emp.getName());
        }

        System.out.println("Средняя зарплата: " + avg);
        System.out.println();

        //Task3
        IntSequence intSequence = IntSequenceUtils.of(1, 2, 6, 7, 8, 3);

        while (intSequence.hasNext()) {
            System.out.println(intSequence.next());
        }
        //Task5
//        IntSequence infinity = IntSequenceUtils.constant(1);
//        while (true){
//            System.out.println(infinity.next());
//        }
        //Task7
        ArrayList<String> list = new ArrayList<>(Arrays.asList("banana", "apple", "cherry", "lemon"));

        System.out.println("До сортировки: " + list);

        ListUtils.luckySort(list, String::compareTo);

        System.out.println("После сортировки: " + list);
        //13
        Runnable task1 = () -> System.out.println("Task1");
        Runnable task2 = () -> System.out.println("Task2");
        Runnable task3 = () -> System.out.println("Task3");
        Runnable task4 = () -> System.out.println("Task4");

        Runnable comb = RunUtil.combine(task1, task2, task3, task4);

        comb.run();

        System.out.println();

        //Chapter4 Task1
        //Chapter4 Task1
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        LabeledPoint lp1 = new LabeledPoint("A", 1, 2);
        LabeledPoint lp2 = new LabeledPoint("A", 1, 2);
        LabeledPoint lp3 = new LabeledPoint("B", 1, 2);
        System.out.println();
//toString
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println();
//equals
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("lp1.equals(lp2): " + lp1.equals(lp2));
        System.out.println("p1.equals(lp3): " + p1.equals(lp3));

        //hashCode
        System.out.println("p1.hashCode(): " + p1.hashCode());
        System.out.println("p2.hashCode(): " + p2.hashCode());
        System.out.println("lp1.hashCode(): " + lp1.hashCode());
        //protected

        lp1.someMethod();
        System.out.println();

        //Shape

        Point center = new Point(0,0);
        double raduis = 5.0;
        Circle circle = new Circle(center, raduis);
        System.out.println("Центр " + circle.getCenter());
        System.out.println();

        Point topLeft = new Point(2, 3);
        double width = 8.0;
        double height = 6.0;
        Rectangle rectangle = new Rectangle(topLeft, width, height);
        System.out.println("Центр " + rectangle.getCenter());
        System.out.println();

        Point from = new Point(0, 0);
        Point to = new Point(10, 10);
        Line line = new Line(from, to);
        System.out.println("Центр " + line.getCenter());
        System.out.println();

        System.out.println("Демонстрация перемещения");
        System.out.println("Центр круга: " + circle.getCenter());
        System.out.println("Центр прямоугольника: " + rectangle.getCenter());
        System.out.println("Центр линии: " + line.getCenter());
        System.out.println();

        System.out.println("После перемещения");
        circle.movedBy(1, 1);
        rectangle.movedBy(1, 1);
        line.movedBy(1, 1);

        System.out.println("Центр круга: " + circle.getCenter());
        System.out.println("Центр прямоугольника: " + rectangle.getCenter());
        System.out.println("Центр линии: " + line.getCenter());

        System.out.println();

        //EnumColor
        Color myColor = Color.RED;

        System.out.println("Текущий цвет: " + myColor);
        System.out.println("Red: " + myColor.getRed());
        System.out.println("Green: " + myColor.getGreen());
        System.out.println("Blue: " + myColor.getBlue());
        System.out.println("RGB: " + myColor.getRed() + ", " + myColor.getGreen() + ", " + myColor.getBlue());

        for (Color c : Color.values()) {
            System.out.println(c.name() + ": R=" + c.getRed() + ": G=" + c.getGreen() + ": B=" + c.getBlue());
        }

    }


}





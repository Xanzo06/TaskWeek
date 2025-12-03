package org.example;

import org.example.taskweekchapter3.IntSequence;
import org.example.taskweekchapter3.IntSequenceUtils;
import org.example.taskweekchapter3.ListUtils;
import org.example.taskweekchapter3.RunUtil;
import org.example.taskweekchapter3.DataAnalyzer;
import org.example.taskweekchapter3.Measurable;
import org.example.taskweekchapter3.Employee;
import org.example.taskweekchapter2.Invoice;
import org.example.taskweekchapter2.Point;
import org.example.taskweekchapter2.Point2;
import org.example.taskweekchapter2.math.utils.Calculator;
import org.example.taskweekchapter2.models.Teacher;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Учитель:");
        Teacher teacher = new Teacher("Борис Борисович", "Физкультура");
        teacher.teach();
        System.out.println();
        int a = 10;
        int b = 5;
        System.out.println("Калькулятор:");
        System.out.println("Сложение: " + Calculator.add(a, b));
        System.out.println("Вычитание: " + Calculator.subtract(a, b));
        System.out.println("Умножение: " + Calculator.multiply(a, b));
        System.out.println("Деление: " + Calculator.divide(a, b));
        System.out.println();

        Point point1 = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println("Координаты после: " + point1);

        System.out.println();

        Point2 point2 = new Point2(3, 4);
        System.out.println("До: " + point2);

        point2.translate(1, 3);
        System.out.println("После translate: " + point2);
        point2.scale(0.5);
        System.out.println("После scale: " + point2);
        System.out.println();
        Invoice invoice = new Invoice(123, "ООО Канцтовары", "Борисов Б.Б");
        invoice.addItem("Ручка", 2, 50.0);
        invoice.addItem("Блокнот", 1, 100.0);

        invoice.printInvoice();

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

    }
}




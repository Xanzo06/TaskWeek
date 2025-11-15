package org.example;

import taskweekchapter2.Invoice;
import taskweekchapter2.Point;
import taskweekchapter2.Point2;
import taskweekchapter2.models.Teacher;
import taskweekchapter2.math.utils.Calculator;

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
    }


}



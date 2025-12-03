package org.example.taskweekchapter2;

public class Car {
    private final double consumption;
    private double fuel;
    private double x;

    public Car(double consumption) {
        this.consumption = consumption;
        this.fuel = 0;
        this.x = 0;
    }

    public void drive(double distance) {
        double neededFuel = distance / consumption;
        if (neededFuel <= fuel) {
            fuel -= neededFuel;
            x += distance;
        } else {
            System.out.println("Недостаточно топлива для поездки");
        }

    }

    public void refuel(double litres) {
        fuel += litres;
    }

    public double getFuel() {
        return fuel;
    }


    public double getConsumption() {
        return consumption;
    }

    public int getX() {
        return (int) x;
    }

    public static void main(String[] args) {
        Car car = new Car(10.0);
        car.refuel(50.0);
        car.drive(100.0);
        System.out.println("Проверка сколько топлива осталось после поездки: " + car.getFuel());
        car.drive(200);
        car.refuel(30);
        System.out.println("Топливо после повторной заправки: " + car.getFuel());
        System.out.println("Местоположение автомобиля после пройденго пути по координате x: " + car.getX());




    }
}

package org.example.taskweekchapter2.Chapter2Task4;

public class Car {
    public String vin;
    public static int totalCars = 0;

    public Car(String vin) {
        this.vin = vin;
        totalCars++;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public static int getTotalCars() {
        return totalCars;
    }

    public static void resetCounter() {
        totalCars = 0;
    }


    public static void main(String[] args) {
        Car car1 = new Car("VIN123456");
        Car car2 = new Car("VIN456783");
        Car car3 = new Car("VIN234567");
        System.out.println("VIN 1 автомобиля: " + car1.getVin());
        System.out.println("VIN 2 автомобиля: " + car2.getVin());
        System.out.println("VIN 3 автомобиля: " + car3.getVin());
        System.out.println("Всего автомобилей создано: " + Car.getTotalCars());


        Car.resetCounter();
        System.out.println("После сброса: " + Car.getTotalCars());

        Car car4 = new Car("VIN909090");
        System.out.println("VIN 4 автомобиля: " + car4.getVin());
        System.out.println("После создания нового автомобиля: " + Car.getTotalCars());
    }



}

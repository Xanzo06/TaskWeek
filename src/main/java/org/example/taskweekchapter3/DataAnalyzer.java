package org.example.taskweekchapter3;

public class DataAnalyzer {
    public static double average(Measurable[] objects){
        double sum = 0;
        for (Measurable obj : objects){
            sum += obj.getMeasure();
        }
        return sum / objects.length;
    }
    public static Measurable largest(Measurable[] objects){
        if (objects.length == 0){
            return null;
        }
        Measurable largest = objects[0];
        for (int i = 1; i < objects.length; i++){
            if (objects[i].getMeasure() > largest.getMeasure()){
                largest = objects[i];
            }
        }
        return largest;
    }
}

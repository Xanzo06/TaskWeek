package org.example.taskweekchapter5.Task7;


public class Task7 {
    public static void main(String[] args) {
        Task7 task7 = new Task7();
        System.out.println(task7.printTask7("txt.task1"));

    }

    public boolean printTask7(String filename) {
        try (FileImitation fileImitation = new FileImitation()) {
            fileImitation.doWork();
        }catch (Exception e){
            System.out.println("Основное исключение: " + e.getMessage());
            for (Throwable throwable : e.getSuppressed()){
                System.out.println("Подавленное исключение: " + throwable.getMessage());
            }
        }
        return false;
    }

}

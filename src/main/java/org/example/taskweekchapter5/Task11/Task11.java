package org.example.taskweekchapter5.Task11;


public class Task11 {
    public static void main(String[] args) {
        NullCheckExample example = new NullCheckExample();
        User user = new User("Боря");
        try {
            example.getUser(null);
        }catch (NullPointerException e){
            System.out.println("Ошибка: " + e.getMessage());
        }

        example.getUser(user);


    }
}

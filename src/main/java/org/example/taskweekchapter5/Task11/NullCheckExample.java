package org.example.taskweekchapter5.Task11;

import java.util.Objects;

public class NullCheckExample {
    public void getUser(User user){
        Objects.requireNonNull(user, "Пользователь не может быть null");

        assert user.getName() != null : "Имя пользователя не может быть null";

        System.out.println("Обработка пользователя: " + user.getName());
    }
}

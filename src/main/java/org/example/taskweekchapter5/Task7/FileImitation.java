package org.example.taskweekchapter5.Task7;

public class FileImitation implements AutoCloseable{
    @Override
    public void close() throws Exception {
        throw new Exception("Ошибка при закрытие файла");
    }

    public void doWork() throws Exception {
        throw new Exception("Ошибка при работе с файлом");
    }

}

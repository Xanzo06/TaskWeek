package taskweekchapter2;

import java.util.ArrayList;
import java.util.List;

public class RandomNumbers {

    public static <T> T getRandomElement(T[] arr) {
        if (arr.length == 0) {
            return null;
        }
        int randomNum = (int) (Math.random() * arr.length);
        return arr[randomNum];
    }

    public static <T> T getRandomElement(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        int randomNum = (int) (Math.random() * list.size());
        return list.get(randomNum);
    }

    public static void main(String[] args) {
        String[] names = {"Маша", "Петя", "Саша", "Дима"};
        String randomName = RandomNumbers.getRandomElement(names);
        System.out.println(randomName);

        Integer[] numbers = {10, 20, 30, 40, 50};
        Integer randomNumber = RandomNumbers.getRandomElement(numbers);
        System.out.println("Случайное число: " + randomNumber);

        List<String> names1 = new ArrayList<>();
        names1.add("Боря");
        names1.add("Vito");
        names1.add("Stas");
        names1.add("Luka");
        names1.add("Steve");
        String randomName1 = RandomNumbers.getRandomElement(names1);
        System.out.println(randomName1);

        List<Integer> numbers1 = List.of(1, 2, 3, 5, 6);
        Integer randomNumber1 = RandomNumbers.getRandomElement(numbers1);

        System.out.println("Случайное число: " + randomNumber1);
    }

}


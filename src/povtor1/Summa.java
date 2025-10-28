package povtor1;

import java.util.List;

public class Summa {
    public static void Summa(List<Integer> arr) {
        int totalSum = 0;
        int min = arr.get(0);
        int max = arr.get(0);

        for (int num : arr) {
            totalSum += num;
            if (num < min) {
                min = num;


            }
            if (num > max) {
                max = num;
            }
        }
long minSum = totalSum - max;
        long maxSum = totalSum - min;

    }
}
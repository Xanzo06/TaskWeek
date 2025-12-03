package org.example.taskweekchapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListUtils {
    public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        do {
            Collections.shuffle(strings);
        }while (!isSorted(strings, comp));
    }

    private static boolean isSorted(ArrayList<String> strings, Comparator<String> comp) {
        for (int i = 1; i < strings.size(); i++ ){
            if (comp.compare(strings.get(i - 1), strings.get(i)) > 0){
                return false;
            }
        }
        return true;
    }
}

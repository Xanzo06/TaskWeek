package org.example.taskweekchapter3;

public class RunUtil {
    public static Runnable combine(Runnable... runnable){
        return () -> {
            for (Runnable r : runnable)
                r.run();
        };

    }
}

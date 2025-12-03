package org.example.taskweekchapter3;

public class IntSequenceUtils {
    public static IntSequence of(int... values) {
        return new IntSequence() {
            int index = 0;

            @Override
            public int next() {
                return values[index++];
            }

            @Override
            public boolean hasNext() {
                return index < values.length;
            }
        };
    }

    public static IntSequence constant(int value) {
        return () -> value;
    }
}

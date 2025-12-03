package org.example.taskweekchapter3;

@FunctionalInterface
public interface IntSequence {
    int next();

    default boolean hasNext() {
        return true;
    }
}


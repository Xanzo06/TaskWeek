package org.example.taskweekchapter5.Task8;

import java.util.concurrent.locks.ReentrantLock;

public class Lock implements AutoCloseable {

    ReentrantLock lock;

    public Lock(ReentrantLock lock) {
        this.lock = lock;
        lock.lock();
    }

    @Override
    public void close() throws Exception {
        if (lock != null) {
            lock.unlock();
        }
    }
}

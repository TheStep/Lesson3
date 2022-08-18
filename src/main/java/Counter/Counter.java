package Counter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private Long counter = 0L;
    private final Lock lock = new ReentrantLock();

    public void increaseCounter() {
        try {
            lock.lock();
            counter++;
        } finally {
            lock.unlock();
        }
    }

    public long getCounter() {
        return counter;
    }
}


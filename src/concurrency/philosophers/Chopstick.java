package concurrency.philosophers;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Chopstick {
    private Lock _lock;
    private int _value;

    public Chopstick(int value) {
        _lock = new ReentrantLock();
        _value = value;
    }

    public void pickUp() {
        _lock.lock();
    }

    public void putDown() {
        _lock.unlock();
    }

    public int getValue() {
        return _value;
    }
}

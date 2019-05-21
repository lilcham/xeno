package concurrency.xeno;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FizzBuzzThreadLock implements Runnable {
    private static Lock _lock = new ReentrantLock();
    protected static final String NAME = "Lock";
    protected static int _current = 1;

    private boolean _checkThree;
    private boolean _checkFive;
    private int _max;
    private String _toPrint;


    public FizzBuzzThreadLock(boolean checkThree, boolean checkFive, int max, String toPrint) {
        _checkFive = checkFive;
        _checkThree = checkThree;
        _max = max;
        _toPrint = toPrint;
    }

    public void print() {
        System.out.println(NAME + ": " + _toPrint);
    }

    @Override
    public void run() {
        while (true) {
            if (_lock.tryLock()) {
                if (_current > _max) {
                    _lock.unlock();
                    return;
                }

                if ((_current % 3 == 0) == _checkThree && (_current % 5 == 0) == _checkFive) {
                    print();
                    _current++;
                }

                _lock.unlock();
            }
        }
    }
}

package concurrency.xeno;

import java.util.concurrent.Semaphore;

public class FizzBuzzThreadSemaphore implements Runnable {
    protected static int _current = 1;
    protected static final String NAME = "Semaphore";
    private static Semaphore _semaphore = new Semaphore(1);

    private boolean _checkThree;
    private boolean _checkFive;
    private int _max;
    private String _toPrint;

    public FizzBuzzThreadSemaphore (boolean checkThree, boolean checkFive, int max, String toPrint) {
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
            if (_semaphore.tryAcquire()) {
                if (_current > _max) {
                    _semaphore.release();
                    return;
                }

                if ((_current % 3 == 0) == _checkThree && (_current % 5 == 0) == _checkFive) {
                    print();
                    _current++;
                }

                _semaphore.release();
            }
        }
    }
}

package concurrency.xeno;

public class FizzBuzzThreadSynchronized implements Runnable {
    protected static int _current = 1;
    protected static final String NAME = "Synchronized";
    private static Object _lock = new Object();

    private boolean _checkThree;
    private boolean _checkFive;
    private int _max;
    private String _toPrint;


    public FizzBuzzThreadSynchronized (boolean checkThree, boolean checkFive, int max, String toPrint) {
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
            synchronized (_lock) {
                if (_current > _max) {
                    return;
                }

                if ((_current % 3 == 0) == _checkThree && (_current % 5 == 0) == _checkFive) {
                    print();
                    _current++;
                }
            }
        }
    }
}

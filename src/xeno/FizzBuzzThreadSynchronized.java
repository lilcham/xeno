package xeno;

public class FizzBuzzThreadSynchronized implements Runnable {
    private static int _current = 0;
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

    @Override
    public void run() {
        while (true) {
            synchronized (_lock) {
                if (_current > _max) {
                    return;
                }

                if ((_current % 3 == 0) == _checkThree && (_current % 5 == 0) == _checkFive) {
                    System.out.println(_toPrint);
                } else {
                    System.out.println(_current);
                }

                _current++;
            }
        }
    }
}

package concurrency.xeno;

public class CurrentThreadSynchronized extends FizzBuzzThreadSynchronized {
    public CurrentThreadSynchronized(boolean checkThree, boolean checkFive, int max) {
        super(checkThree, checkFive, max, null);
    }

    public void print() {
        System.out.println(this.NAME + ": " + this._current);
    }
}

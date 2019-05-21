package concurrency.xeno;

public class CurrentThreadLock extends FizzBuzzThreadLock {
    public CurrentThreadLock(boolean checkThree, boolean checkFive, int max) {
        super(checkThree, checkFive, max, null);
    }

    public void print() {
        System.out.println(this.NAME + ": " + this._current);
    }
}

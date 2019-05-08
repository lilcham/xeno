package xeno;

public class CurrentThreadSemaphore extends FizzBuzzThreadSemaphore {
    public CurrentThreadSemaphore(boolean checkThree, boolean checkFive, int max) {
        super(checkThree, checkFive, max, null);
    }

    public void print() {
        System.out.println(this.NAME + ": " + this._current);
    }
}

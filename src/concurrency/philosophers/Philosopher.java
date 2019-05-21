package concurrency.philosophers;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Philosopher extends Thread {
    private int _bites = 10;
    private int _id;
    private Chopstick _lower, _higher;
    private CyclicBarrier _barrier;

    public Philosopher(int id, Chopstick left, Chopstick right, CyclicBarrier barrier) {
        _id = id;
        _barrier = barrier;

        if (left.getValue() < right.getValue()) {
            _lower = left;
            _higher = right;
        } else {
            _lower = right;
            _higher = left;
        }
    }

    public void eat() {
        pickUp();
        chew();
        putDown();
    }

    private void chew() {
        try {
            System.out.println(_id + " is Currently Eating");
            Thread.sleep(1000);
            System.out.println(_id + " is Finished Eating");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void pickUp() {
        _lower.pickUp();
        _higher.pickUp();
    }

    private void putDown() {
        _higher.putDown();
        _lower.putDown();
    }

    @Override
    public void run() {
        try {
            _barrier.await();
            while (true) {
                eat();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

package philosophers;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main {
    private static final int NUMBER_OF_PHILOSOPHERS = 10;
    private static final CyclicBarrier _gate = new CyclicBarrier(NUMBER_OF_PHILOSOPHERS + 1);

    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        Chopstick[] chopsticks = new Chopstick[NUMBER_OF_PHILOSOPHERS];

        for (int i = 0; i < NUMBER_OF_PHILOSOPHERS; i++) {
            chopsticks[i] = new Chopstick(i);
        }

        for (int i = 0; i < NUMBER_OF_PHILOSOPHERS; i++) {
            Philosopher p;

            if (i < (NUMBER_OF_PHILOSOPHERS - 1)) {
                p = new Philosopher(i, chopsticks[i], chopsticks[i+1], _gate);
            } else {
                p = new Philosopher(i, chopsticks[i], chopsticks[0], _gate);
            }

            p.start();
        }

        _gate.await();

        while (true) {

        }
    }
}

package xeno;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static final int NUMBER_OF_THREADS = 4;
    private static final int MAX = 1000;

    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

        /*
        pool.execute(new FizzBuzzThreadLock(true, true, MAX, "FizzBuzz"));
        pool.execute(new FizzBuzzThreadLock(true, false, MAX, "Fizz"));
        pool.execute(new FizzBuzzThreadLock(false, true, MAX, "Buzz"));
        pool.execute(new FizzBuzzThreadLock(false, false, MAX, ""));
        */

        pool.execute(new FizzBuzzThreadSynchronized(true, true, MAX, "FizzBuzz"));
        pool.execute(new FizzBuzzThreadSynchronized(true, false, MAX, "Fizz"));
        pool.execute(new FizzBuzzThreadSynchronized(false, true, MAX, "Buzz"));
        pool.execute(new FizzBuzzThreadSynchronized(false, false, MAX, ""));
    }
}

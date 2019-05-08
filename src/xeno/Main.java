package xeno;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static final int NUMBER_OF_THREADS = 4;
    private static final int MAX = 1000;

    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

        pool.execute(new FizzBuzzThread(true, true, MAX, "FizzBuzz"));
        pool.execute(new FizzBuzzThread(true, false, MAX, "Fizz"));
        pool.execute(new FizzBuzzThread(false, true, MAX, "Buzz"));
        pool.execute(new FizzBuzzThread(false, false, MAX, ""));
    }
}

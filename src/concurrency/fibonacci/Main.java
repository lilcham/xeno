package concurrency.fibonacci;

import java.text.DecimalFormat;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        double answer = pool.invoke( new Fibonacci(200));
        DecimalFormat formatter = new DecimalFormat("#,###");

        System.out.println("Answer = " + formatter.format(answer));

        Task task = new Task();
    }
}

class Task {
    public Task() {
        System.out.println("Kalana");
    }
}

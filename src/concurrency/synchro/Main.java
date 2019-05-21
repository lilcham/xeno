package concurrency.synchro;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(2);
        Database db = new Database();

        exec.execute(new Task("Task 1", db));
        exec.execute(new Task("Task 2", db));
    }
}

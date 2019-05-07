package executor;

public class Main {
    public static void main(String[] args) {
        ThreadPool pool = new ThreadPool(4);

        for (int i = 0; i < 10; i++) {
            Task task = new Task("Task: " + i);
            pool.execute(task);
        }
    }
}

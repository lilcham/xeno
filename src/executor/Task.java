package executor;

/***
 * Simple task class that uses a thread.sleep to represent heavy work
 */
public class Task implements Runnable {
    private String _message;

    public Task(String message) {
        _message = message;
    }

    @Override
    public void run() {
        System.out.println("Starting Task with message {" + _message + "}");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished Task with message {" + _message + "}");
    }
}

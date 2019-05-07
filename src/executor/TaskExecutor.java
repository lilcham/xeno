package executor;

import java.util.Queue;

/***
 * This class represents the wrapper for the runnable that runs the tasks when there are tasks to run
 */
public class TaskExecutor implements Runnable {
    private Queue<Runnable> _buffer;

    public TaskExecutor(Queue<Runnable> buffer) {
        _buffer = buffer;
    }

    //Override the run() method so that it pulls a task from the queue, checks if it is null, then runs the task
    @Override
    public void run() {
        while (true) {
            Runnable task = _buffer.poll();
            if (task != null) {
                String name = Thread.currentThread().getName();
                System.out.println("Task Started on Thread: " + name);
                task.run();
                System.out.println("Task Finished on Thread: " + name);
            }
        }
    }
}

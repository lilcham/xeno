package concurrency.executor;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ThreadPool {
    private static final int DEFAULT_POOL_SIZE = 4;
    private Queue<Runnable> _buffer;

    //Defaults to thread pool of size determined by DEFAULT_POOL_SIZE value
    public ThreadPool() {
        setUpExecutorService(DEFAULT_POOL_SIZE);
    }

    //Can create one with a sepcified pool size
    public ThreadPool(int size) {
        setUpExecutorService(size);
    }

    private void setUpExecutorService(int size) {
        _buffer = new ConcurrentLinkedDeque<Runnable>();

        //Loop through and start all the threads - gives concurrent buffer to the different threads
        for (int i = 0; i < size; i++) {
            TaskExecutor task = new TaskExecutor(_buffer);
            String threadName = "Thread-" + i;
            Thread thread = new Thread(task, threadName);
            thread.start();
        }
    }

    public void execute(Runnable task) {
        //Adds tasks to the buffer queue
        _buffer.add(task);
    }
}

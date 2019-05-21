package patterns.flyweight;

import java.util.Vector;

/**
 * The ThreadPool class plays the role of the Factory.
 * As ColorBox objects are created, they register themselves with the ThreadPool object.
 * The latter launches 8 "handler" threads.
 * When each thread is swapped into the CPU, it selects a random Flyweight from the ThreadPool's cache, and asks the object to changeColor().
 */
class ThreadPool {
    private Vector boxes = new Vector();
    private int pause;

    class HandlerThread extends Thread {
        public void run() {
            while(true) {
                ((ColorBox)boxes.elementAt(
                        (int)(Math.random()*1000) % boxes.size() )).changeColor();
                try {
                    Thread.sleep(pause);
                } catch(InterruptedException ignored) {}
            }
        }
    }

    public ThreadPool(int p) {
        pause = p;
    }

    public void register(ColorBox r) {
        boxes.addElement(r);
    }

    public void start() {
        int NUM_THREADS = 8;
        for (int i = 0; i < NUM_THREADS; i++) {
            new HandlerThread().start();
        }
    }
}

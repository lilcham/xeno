package synchro;

public class Database {
    private int _count = 0;

    public synchronized void incrementCount(String name) throws InterruptedException {
        System.out.println(name + " Is Accessing DB");
        _count++;
        Thread.sleep(5000);
        System.out.println(name + " Has Finished Accessing DB");
    }

    public synchronized void decrementCount() throws InterruptedException {
        _count--;
        Thread.sleep(5000);
    }

    public synchronized int getCount() {
        return _count;
    }
}

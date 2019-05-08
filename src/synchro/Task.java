package synchro;

public class Task implements Runnable {
    private String _taskName;
    private Database _db;

    public Task(String name, Database db) {
        _taskName = name;
        _db = db;
    }

    @Override
    public void run() {
        try {
            _db.incrementCount(_taskName);
            System.out.println(_taskName + " Count: " + _db.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package patterns.strategy;

// 2. Bury implementation
@SuppressWarnings("ALL")
abstract class StrategySolution implements Strategy {
    // 3. Template Method
    public void solve() {
        start();
        while (nextTry() && !isSolution()) {}
        stop();
    }

    abstract void start();
    abstract boolean nextTry();
    abstract boolean isSolution();
    abstract void stop();
}

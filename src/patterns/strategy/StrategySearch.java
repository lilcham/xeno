package patterns.strategy;

// 2. Bury implementation
abstract class StrategySearch implements Strategy {
    // 3. Template Method
    public void solve() {
        while (true) {
            preProcess();
            if (search()) {
                break;
            }
            postProcess();
        }
    }

    abstract void preProcess();
    abstract boolean search();
    abstract void postProcess();
}

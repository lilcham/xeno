package patterns.bridge;

/**
 * Embellish the interface class with derived classes if desired
 */
class StackHanoi extends Stack {
    private int totalRejected = 0;

    public StackHanoi() {
        super("java");
    }

    public StackHanoi(String s) {
        super(s);
    }

    public int reportRejected() {
        return totalRejected;
    }

    public void push(int in) {
        if (!imp.empty() && in > (Integer)imp.peek()) {
            totalRejected++;
        } else {
            imp.push(in);
        }
    }
}
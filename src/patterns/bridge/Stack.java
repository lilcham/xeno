package patterns.bridge;

/**
 * Create an interface/wrapper class that "has a"
 * implementation object and delegates all requests to it
 */
class Stack {
    protected StackImp imp;

    public Stack(String s) {
        if (s.equals("java")) {
            imp = new StackJava();
        }
        else {
            imp = new StackMine();
        }
    }
    
    public Stack() {
        this("java");
    }

    public void push(int in) {
        imp.push(in);
    }

    public int pop() {
        return (Integer) imp.pop();
    }

    public boolean isEmpty() {
        return imp.empty();
    }
}

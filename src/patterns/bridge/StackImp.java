package patterns.bridge;

/**
 * Create an implementation/body base class
 */
interface StackImp {
    Object push(Object o);
    Object peek();
    boolean empty();
    Object pop();
}

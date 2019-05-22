package patterns.command;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ReflectCommand {
    // the "encapsulated" object
    private Object receiver;
    // the "pre-registered" request
    private Method action;
    // the "pre-registered" request
    private Object[] args;

    public ReflectCommand(Object obj, String methodName, Object[] arguments) {
        this.receiver = obj;
        this.args = arguments;
        Class cls = obj.getClass();
        Class[] argTypes = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            argTypes[i] = args[i].getClass();
        }
        try {
            action = cls.getMethod(methodName, argTypes);
        } catch(NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public Object execute() {
        try {
            action.invoke(receiver, args);
            return receiver.getClass().getMethod("getState").invoke(receiver);
        }
        catch(IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}

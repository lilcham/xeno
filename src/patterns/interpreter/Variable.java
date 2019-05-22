package patterns.interpreter;

import java.util.Map;

class Variable implements Operand {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public void traverse(int level) {
        System.out.print(name + " ");
    }

    public double evaluate(Map<String, Integer> context) {
        return context.get(name);
    }
}

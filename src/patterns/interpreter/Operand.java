package patterns.interpreter;

import java.util.Map;

interface Operand {
    double evaluate(Map<String, Integer> context);
    void traverse(int level);
}

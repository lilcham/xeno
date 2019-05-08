package fibonacci;

import java.text.DecimalFormat;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.RecursiveTask;

public class Fibonacci extends RecursiveTask<Double> {
    private double _number;
    private static ConcurrentMap<Double, Double> _map = new ConcurrentHashMap<>();

    public Fibonacci(double number) {
        _number = number;
    }

    @Override
    protected Double compute() {
        DecimalFormat formatter = new DecimalFormat("#,###");
        System.out.println("Evaluating: " + formatter.format(_number));

        if (_number <= 1) {
            return _number;
        } else if (_map.containsKey(_number)) {
            return _map.get(_number); //Memoization to improve efficiency
        } else {
            Fibonacci taskOne = new Fibonacci(_number - 1);
            taskOne.fork();
            Fibonacci taskTwo = new Fibonacci(_number - 2);
            double result = taskTwo.compute() + taskOne.join(); //Join the forked task and then compute the other

            _map.putIfAbsent(_number, result); //Only puts the result if absent
            return result;
        }
    }
}

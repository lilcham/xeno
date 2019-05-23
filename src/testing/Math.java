package testing;

public final class Math {

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int multiply(int number, int multiplier) {
        return number * multiplier;
    }

    public static double divide(int number, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero (0).");
        }

        return number / divisor;
    }
}

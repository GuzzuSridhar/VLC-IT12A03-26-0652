package methods;

public class CalculatorStatic {
    // static methods for calculator
    public static int add(int n, int m) {
        return n + m;
    }

    public static int diff(int n, int m) {
        return n - m;
    }

    public static int prod(int n, int m) {
        return n * m;
    }

    public static int div(int i, int j) {
        return i / j;
    }

    public static void main(String[] args) {
        CalculatorStatic.add(10, 20);
        CalculatorStatic.diff(10, 20);
        CalculatorStatic.prod(10, 20);
        CalculatorStatic.div(10, 20);
    }
}

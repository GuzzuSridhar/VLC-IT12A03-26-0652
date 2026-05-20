package methods;

public class Calculator {
    // Method signature (Syntax)
    // [<access_modifier>] [static] <return_type> <method_name>([parameters])

    // instance method
    public int add(int n, int m) {
        return n + m;
    }

    public int diff(int n, int m) {
        return n - m;
    }

    public int prod(int n, int m) {
        return n * m;
    }

    public int div(int i, int j) {
        return i / j;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // all instance methods are to be accessed via the instance name
        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.diff(10, 20));
        System.out.println(calculator.prod(10, 20));
        System.out.println(calculator.div(10, 20));
    }

}

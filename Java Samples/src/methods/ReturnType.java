package methods;

public class ReturnType {
    // return type is mandatory
    // if nothing is returned from a method, then the return type should be "void"
    // any primitive / object type can be returned
    // if a method is not void, then the return statement is mandatory
    // return statement is the last allowed statement in a method

    // void method
    static void hello() {
        System.out.println("Hello");
    }

    // return type int
    static int add(int a, int b) {
        return a + b;
        // System.out.println(); // not allowed
    }

    // return type float
    static float totalSalary(float salary, float comm) {
        return salary + comm;
    }

    public static void main(String[] args) {
        ReturnType.hello();
        int result = ReturnType.add(10, 50);
        System.out.println(result);
        System.out.println(ReturnType.totalSalary(1999, 7766));
    }
}

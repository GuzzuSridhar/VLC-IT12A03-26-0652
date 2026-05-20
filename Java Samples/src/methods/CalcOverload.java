package methods;

public class CalcOverload {
    // Method Overloading
    // Compile time polymorphism
    // Method with same name but different
    // 1. # arguments
    // 2. Types of arguments
    // 3. Sequence of arguments (types)

    public int add(int i, int j) {
        return i + j;
    }

    // overloaded method (Change count of arguments)
    public int add(int i, int j, int k) {
        return i + j + k;
    }

    public int add(int i, int j, int k, int l) {
        return i + j + k;
    }

    // unliminted arguments (var args)
    public int add(int... n) { // int[] n
        int res = 0;
        for (int i : n) {
            res += i;
        }
        return res;
    }

    // changing type of argument
    public double add(double i, double j) {
        return i + j;
    }

    public double add(int x, double y) {
        return x + y;
    }

    // change sequence of arguments
    public double add(double y, int x) {
        return x + y;
    }

    public static void main(String[] args) {
        CalcOverload co = new CalcOverload();
        co.add(10, 20, 60);
        co.add(10, 20, 60, 80);
        co.add(10, 20);
        co.add(1, 2, 3, 4, 5, 6, 67, 7, 8, 9, 954, 56, 67, 78, 55);
        co.add(10, 88.5);
        co.add(10.88, 88);
    }

}

package conversion.implicit;

public class WideCast {
    public static void main(String[] args) {
        // Implicit casting
        // Also known as Widening
        // convert a smaller type to a larger one

        // byte -> short -> int -> long -> float -> double

        byte b = 25;
        short s = 30;
        int i = 35;
        long l = 40;
        float f = 10.23f;
        double d = 655.88;

        int temp = b;
        int x = 'A';

        double d1 = f;

        // char to int
        int c = 'z'; // 122
    }
}

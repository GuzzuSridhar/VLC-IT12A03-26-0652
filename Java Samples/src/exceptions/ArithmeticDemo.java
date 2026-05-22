package exceptions;

public class ArithmeticDemo {
    public static void main(String[] args) {
        int x = 10, y = 0;
        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println("Invalid operation");
        }
        System.out.println("Here");
    }
}

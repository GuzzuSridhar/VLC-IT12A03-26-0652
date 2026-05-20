package ai;

public class Test {
    // method to return reverse of a string
    public static void reverseString() {
        for (int i = 1; i < 100; i++) {
            System.out.print("*".repeat(i));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        reverseString();
    }

}

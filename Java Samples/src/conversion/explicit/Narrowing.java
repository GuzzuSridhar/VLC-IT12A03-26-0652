package conversion.explicit;

public class Narrowing {
    public static void main(String[] args) {
        // Narrow Cast
        // Explicit Cast
        // Converting Higher size datatype to a lower one
        // Information loss is always there
        // Syntax
        // (targetType) value

        // byte <- short <- int <- long <- float <- double

        double price = 100.67;
        // int amount = price; // cannot compile
        int amount = (int) price;
        System.out.println(amount);

    }
}

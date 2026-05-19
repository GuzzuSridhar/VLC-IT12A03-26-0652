package conversion.implicit;

public class Billing {
    public static void main(String[] args) {
        int itemCount = 5;
        double unitPrice = 2.33;

        double totalAmt = itemCount * unitPrice;
        // in the operation above the itemCount is implicitly converted to Double
        // (widening cast)
        System.out.println(totalAmt);
    }
}

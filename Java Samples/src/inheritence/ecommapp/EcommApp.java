package inheritence.ecommapp;

import java.util.Scanner;

public class EcommApp {
    public static void main(String[] args) {
        double CartTotal = 89.0;

        // Generic Check out
        PaymentProcessor selectedPayment;
        Scanner scan = new Scanner(System.in);
        System.out.print("Select Payment Method: 1 for CC and 2 for PP: ");
        int choice = scan.nextInt();

        if (choice == 1) {
            // If the CC is selected
            selectedPayment = new CreditCardProcessor();
            selectedPayment.processPayment(CartTotal);
        } else if (choice == 2) {
            // if Paypal is selected
            selectedPayment = new PayPalProcessor();
            selectedPayment.processPayment(CartTotal);
        } else
            System.out.println("Choose a correct payment method");

        scan.close();
    }
}

package inheritence.ecommapp;

// parent class
class PaymentProcessor {
    // generic processing method
    public void processPayment(double amount) {
        System.out.println("Processing a generic payment of $" + amount);
    }
}

// subclass : Credit Card payment
class CreditCardProcessor extends PaymentProcessor {
    // override the process payment method

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing a credit card payment of $" + amount);
    }
}

// subclass : Paypal
class PayPalProcessor extends PaymentProcessor {
    // override the process payment method

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing a Pay Pal payment of $" + amount);
    }
}
package abstraction.interfaces;

import java.util.Scanner;

public class CitiBank implements Bank, Mas {

    // @Override
    public double fdInterest(double depAmt, int period) {
        double roi = 3.5;
        double interestPaid = (depAmt * period * roi) / 100;
        return interestPaid;
    }

    // @Override
    public double rdInterest(double depAmt, int period) {
        double roi = 2.5;
        double interestPaid = (depAmt * period * roi) / 100;
        return interestPaid;
    }

    // @Override
    // public double ccInterest(double roi) {
    // return 12.5;
    // }

    @Override
    public boolean archive(int acctno) {
        return true;
    }

    // banks own logic
    void welcome() {
        System.out.println("**********Welcome to Citi Bank*****************");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CitiBank citiBank = new CitiBank();
        citiBank.welcome();
        Mas.sayHello();
        System.out.print("Please Enter a Deposit Type (FD/RD): ");
        String depType = scan.next();
        if (depType.equalsIgnoreCase("FD")) {
            System.out.println("Enter the desired deposit amount: ");
            double amt = scan.nextDouble();
            System.out.println("Enter the desired tenure in months: ");
            int months = scan.nextInt();
            double interestAccured = citiBank.fdInterest(amt, months);
            System.out.println("The Interest for an amount of $"
                    + amt
                    + " invested in Fixed deposit for a period of "
                    + months
                    + " months is: $"
                    + interestAccured);

        } else if (depType.equalsIgnoreCase("RD")) {
            System.out.println("Enter the desired deposit amount: ");
            double amt = scan.nextDouble();
            System.out.println("Enter the desired tenure in months: ");
            int months = scan.nextInt();
            double interestAccured = citiBank.rdInterest(amt, months);
            System.out.println("The Interest for an amount of $"
                    + amt
                    + " invested in Recurring deposit for a period of "
                    + months
                    + " months is: $"
                    + interestAccured);
        }
        scan.close();
    }

}

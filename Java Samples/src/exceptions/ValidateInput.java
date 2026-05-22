package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidateInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = 0;
        boolean isValid = false; // loop variable

        while (!isValid) {
            System.out.print("Enter you age: ");
            try {
                age = scan.nextInt(); // read the age from user
                if (age > 0) {
                    isValid = true;
                } else {
                    System.out.println("Age cannot be Negative");
                }
            } catch (InputMismatchException i) {
                System.out.println("Invalid Entry, please enter a valid number");
                scan.nextLine();
            }
        }
        System.out.println("You are " + age + " years old");
        scan.close();
    }
}

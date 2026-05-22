package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OtherExceptions {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30 };
        String test = "Hello";
        Scanner in = new Scanner(System.in);
        try {
            System.out.println(nums[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Trying to access invalid element");
        }
        try {
            System.out.println(test.charAt(10));
        } catch (StringIndexOutOfBoundsException s) {
            System.out.println("Invalid Sting index accessed");
        }

        System.out.print("Enter your Age: ");
        try {
            int age = in.nextInt();
        } catch (InputMismatchException i) {
            System.out.println("Invalid entry");
        }
        System.out.println("Out of all the exceptions");
    }
}

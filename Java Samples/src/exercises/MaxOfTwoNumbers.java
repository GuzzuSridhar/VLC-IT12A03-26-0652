package exercises;

import java.util.Scanner;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        int x, y;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        x = scan.nextInt();
        System.out.print("Enter aother Number: ");
        y = scan.nextInt();

        // using if-else
        if (x > y) {
            System.out.println(x + " is greater");
        } else {
            System.out.println(y + " is greater");
        }

        // using Ternary
        System.out.println((x > y) ? x + " is greater" : y + " is greater");

        scan.close();
    }
}

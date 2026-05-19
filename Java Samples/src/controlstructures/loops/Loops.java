package controlstructures.loops;

public class Loops {
    public static void main(String[] args) {
        // print numbers from 1 to 10 using all three loop types

        // while loop
        int num = 1; // loop variable
        while (num < 11) { // exit condition
            System.out.print(num + " ");
            num++; // loop variable itration
        }
        System.out.println();

        // Do While Loop
        int num1 = 1; // loop variable
        do {
            System.out.print(num1 + " ");
            num1++; // loop variable itration
        } while (num1 < 11); // exit condition

        System.out.println();

        // for loop
        // all three aspects(loop variable, Exit Condition, Iteration ) happen on same
        // line
        // loop variable is local to the loop and cannot be accessed after the loop.
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }

    }
}

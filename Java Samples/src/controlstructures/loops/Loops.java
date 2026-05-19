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

        // Do While Loop
        int num1 = 1; // loop variable
        do {
            System.out.println(num1);
            num1++; // loop variable itration
        } while (num1 < 11); // exit condition

    }
}

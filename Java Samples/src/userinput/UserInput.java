package userinput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Scanner class in the java util package is used to capture user input
        Scanner scan = new Scanner(System.in);

        // Capture Strings (one word)
        String name, desig, addr;
        System.out.print("Enter your Name: ");
        name = scan.next(); // takes text input
        System.out.println("Welcome " + name);

        scan.nextLine();

        // Capture Strings (line of text)
        System.out.print("Enter your Designation: ");
        desig = scan.nextLine(); // takes text input
        System.out.println(desig);

        // scan Integers
        int age;
        System.out.print("Enter your age: ");
        age = scan.nextInt(); // takes int input
        System.out.println(age);

        // Scan Floats
        float sal;
        System.out.print("Enter your salary ");
        sal = scan.nextFloat();
        System.out.println(sal);

        scan.nextLine();

        // Capture Strings (line of text)
        System.out.print("Enter your Address: ");

        addr = scan.nextLine(); // takes text input
        System.out.println(addr);

        scan.close();
    }
}

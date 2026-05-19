package controlstructures.conditions;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        float salary;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Salary: ");
        salary = input.nextFloat();

        // based on the current salary, decide the increment

        if (salary <= 5000) {
            salary += 1000;
        } else if (salary > 5000 && salary < 7500) {
            salary += 750;
        } else if (salary > 7500 && salary < 10000) {
            salary += 500;
        } else {
            salary += 250;
        }

        // if statement / block is mandatory
        // we can have zero or more else if blocks
        // we have zero or one else blocks

        System.out.println("Yor revised monthly salary is: " + salary);
        input.close();
    }
}

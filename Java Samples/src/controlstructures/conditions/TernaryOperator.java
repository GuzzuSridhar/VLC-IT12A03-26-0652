package controlstructures.conditions;

public class TernaryOperator {
    public static void main(String[] args) {
        // shorthand for writing the if-else
        // syntax--> condition ? value_if_true : value_if_false

        int age = 15, num = 10, marks = 75;

        String result = age >= 18 ? "Adult" : "Minor";
        System.out.println(result);
        // aternatively
        System.out.println(age >= 18 ? "Adult" : "Minor");

        // Even Odd
        String res = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(res);
        // alternatively
        System.out.println((num % 2 == 0) ? "Even" : "Odd");

        // Nested Ternary
        // Grade system
        String grade = (marks >= 90) ? "A" : (marks >= 75) ? "B" : (marks >= 50) ? "C" : "Fail";
        System.out.println(grade);
        // alternatively
        System.out.println((marks >= 90) ? "A" : (marks >= 75) ? "B" : (marks >= 50) ? "C" : "Fail");

    }
}

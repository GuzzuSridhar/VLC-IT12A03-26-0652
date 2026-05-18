package basics;

public class Concatenation {
    public static void main(String[] args) {
        // Concatenation (concat) is process of joining strings
        String fName = "Bill", lName = "Gates";

        // use concatenate Strings in a variable
        String fullName = fName + " " + lName;
        System.out.println(fullName);

        // use concat directly in the print statement
        System.out.println(fName + " " + lName);

        // using concat with numbers ( when the operands are numbers, than the + acts as
        // mathametical operation)
        int sal = 1000, com = 100;
        System.out.println(sal + com); // 1100

        // if a string is added in between the numbers, all numbers will be treated as
        // strings
        System.out.println(sal + "" + com); // 1000100

        // use brackets to prioritize the airthemetic operations
        System.out.println("The total income of " + fName + " " + lName + " is " + (sal + com));

    }
}

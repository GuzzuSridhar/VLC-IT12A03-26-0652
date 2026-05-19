package controlstructures.conditions;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        int dow = sc.nextInt();
        switch (dow) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid Entry");
        }

        // also display if the dow is a weekend or a work day
        switch (dow) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Workday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("invalid Entry");
        }

        // Modern Switch Expression (Version 14 and above)
        switch (dow) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Monday");
            case 4 -> System.out.println("Monday");
            case 5 -> System.out.println("Monday");
            case 6 -> System.out.println("Monday");
            case 7 -> System.out.println("Monday");
            default -> System.out.println("Invalid Entry");
        }

        // assign the output of a switch to a variable (Switch in Expression)
        String day = switch (dow) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid entry";
        };
        System.out.println(day);

        // Multiple labels in once case
        String type = switch (dow) {
            case 1, 2, 3, 4, 5 -> "Workday";
            case 6, 7 -> "Weekend";
            default -> "Invalid entry";
        };
        System.out.println(type);

    }
}

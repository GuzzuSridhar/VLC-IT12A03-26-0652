package dates;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        // get the current date
        LocalDate today = LocalDate.now();
        System.out.println(today);
        // access parameters of the date
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfYear());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getMonth());

        // Custom dates
        LocalDate dob = LocalDate.of(1957, 2, 21);
        System.out.println(dob);
        // access parameters
        System.out.println(dob.getMonth());

        // methods
        LocalDate x = dob.plusYears(25);
        System.out.println(x);

    }
}

package dates;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        // create a object for dat and time..
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        // access parameters
        System.out.println(today.getDayOfYear());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getHour());
        System.out.println(today.getMinute());
        System.out.println(today.getSecond());
    }
}

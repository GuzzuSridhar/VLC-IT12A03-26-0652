package dates;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo {
    public static void main(String[] args) {
        // get the current time in local time zone
        LocalTime currTime = LocalTime.now();
        System.out.println(currTime);

        // access parameters of time
        System.out.println(currTime.getHour());
        System.out.println(currTime.getMinute());
        System.out.println(currTime.getSecond());

        // formatting the time
        System.out.println("The current Time in India is: " +
                currTime.format(DateTimeFormatter.ofPattern("hh:mm a")));

        // showing time in different zones
        LocalTime sgt = LocalTime.now(ZoneId.of("Asia/Singapore"));
        System.out.println("The current Time in Singapore is: " +
                sgt.format(DateTimeFormatter.ofPattern("hh:mm a")));

    }
}

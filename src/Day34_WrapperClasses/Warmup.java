package Day34_WrapperClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
1. use the localDate & Time get the current date an dtime in following format:
        Sunday, 09:51 Am, Jul/26/2020
 */
public class Warmup {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE,hh:mm a, MMM/dd/yyyy");

        LocalDateTime today = LocalDateTime.now();

        System.out.println(today);

        System.out.println(today.format(dtf));

    }

}

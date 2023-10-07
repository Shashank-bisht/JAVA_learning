//java time
// java.time is immutable - cannot be changed
//datetimeformatter

package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Lect54 {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

//        DateTimeFormatter dd = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter dd = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String mydate = dt.format(dd);// creating date string using date and format
        System.out.println(mydate);

//        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String my = dt.format(df);
        System.out.println(my);
    }
}

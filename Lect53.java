//calender in java
//gregorian calendar is the most common calendar used by us

package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Lect53 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));

        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.isLeapYear(2000));
    }
}

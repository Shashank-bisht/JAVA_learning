//date and time in java

package com.company;

import java.util.Date;

public class Lect52 {
    public static void main(String[] args) {
//        years since 1970
//        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
//        System.out.println(Long.MAX_VALUE);
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
//        System.out.println(d.getDate());
        System.out.println(d.getYear());
    }
}

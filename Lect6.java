// string methods
// string are immutable

package com.company;

import java.util.Locale;

public class Lect6 {
    public static void main(String[] args) {

        String name = "Shanky";
//        int value = name.length();
//        System.out.println(value);

//        to get in small letter
//        String lstring = name.toLowerCase();
//        System.out.println(lstring);

//        to get in capital letter
//        String ustring = name.toUpperCase();
//        System.out.println(ustring);

//        trim-> removes spaces from surrounding
//        String nontrimmedstring = "  shashank  ";
//        System.out.println(nontrimmedstring);
//        System.out.println(nontrimmedstring.trim());

//        substring-> agar 1 kara to 1 sai last tak (starting , end) but last wla include nahi hoga
//        System.out.println(name.substring(1,4));

//        replace -> ("shanky","shashank")
//        System.out.println(name.replace('a','b'));

//        startswith => returns true or false
//        System.out.println(name.startsWith("Sha"));

//        endswith => returns true or false
//        System.out.println(name.endsWith("ky"));

//        charAt = give char we want
//        System.out.println(name.charAt(3));

//        indexOf -> index of a given starting string
//        System.out.println(name.indexOf("a"));
//        lastindexof

        String nme = "shashank";
        System.out.println(nme.equals("Shashank"));
        System.out.println(nme.equalsIgnoreCase("shashank"));
     }
}


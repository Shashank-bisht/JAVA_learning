//try catch block in java

package com.company;

public class Lect41 {
    public static void main(String[] args) {

        int a = 6;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("the result is "+c);
        }
//        e ki jagha kuch bhi likh sakte hai
        catch (Exception e){
            System.out.println("sorry");
//            System.out.println(e);
        }

    }
}

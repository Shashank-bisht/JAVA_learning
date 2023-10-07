//throw vs throw
//throw keyword is used to throw an exception by the programmer

package com.company;

public class Lect47 {
    public static int divide(int a, int b) throws ArithmeticException{
//    made by shanky
        int result = a/b;
        return  result;
    }
    public static void main(String[] args) {
//        shanku= uses divide fu;nction created by harry
        try{
            int c = divide(6,0);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Exception");
        }
    }
}

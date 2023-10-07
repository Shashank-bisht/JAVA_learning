// in java string is a class
// string is a collection of characters

package com.company;
import java.util.Scanner;
public class Lect5 {
    public static void main(String[] args) {
//        String name = "shanky";
//        System.out.println(name);

//        for c programmmer
        int a = 6;
        float b = 5.76f;
        System.out.printf("the value of a is %d and value of b is %f",a,b);//format and printf are same
        System.out.println();
        System.out.format("the value of a is %d and value of b is %f",a,b);
        System.out.println();

//        to take input in form of string
        System.out.print("Enter your name:-");
        Scanner kal = new Scanner(System.in);
        String name = kal.nextLine();
        System.out.println(name);
    }
}
// switch case

//break tod deta hai

package com.company;
import java.util.Scanner;

public class Lect9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("You are going to become adult");
                break;
            case 23:
                System.out.println("You are going to join a job");
                break;
            case 60:
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("enjoy your life");
                break;
        }
    }
}
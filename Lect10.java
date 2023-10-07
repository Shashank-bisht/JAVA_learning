// some practice

package com.company;
import java.util.Scanner;

public class Lect10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your first sub number");
//        int s1 = sc.nextInt();
//        System.out.println("Enter your second sub number");
//        int s2 = sc.nextInt();
//        System.out.println("Enter your third sub number");
//        int s3 = sc.nextInt();
//        if(s1<33 || s2<33 || s3<33){
//            System.out.println("you failed");
//        }
//        else{
//            System.out.println("you passed congratulation!!");
//        }

//        income tax calculator 2.5L - 5.0L 5% , 5.0L - 10.0L 10% , above 10.0L 30%
//
//        System.out.println("Enter your Income in Lakhs per annum");
//        float income = sc.nextFloat();
//        float tax = 0;
//        if(income<2.5){
//            tax+=0;
//        }
//        else if(income>2.5f && income<=5f){
//            tax = tax + .05f * (income-2.5f);
//        }
//        else if(income>5f && income<=10f){
//            tax = tax + .05f * (5f-2.5f);
//            tax = tax + .1f * (income-5f);
//        }
//        else if(income>10f){
//            tax = tax + .05f * (5f-2.5f);
//            tax = tax + .1f * (10f-5f);
//            tax = tax + .3f * (income-10f);
//        }
//
//        System.out.println("total tax you have to pay is " + tax);

//        to calculate the leap year

        System.out.println("Enter the year which you want to check if leap year or not");
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println(year+" is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }
}
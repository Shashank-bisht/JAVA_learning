//variable arguments

package com.company;

public class Lect19 {
//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }

//    to solve the problem of creating numerous methods we use variable arguments
    static int sum(int x ,int ...arr){  // where x is very necessary
        int result = x;
        for(int a:arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
//        System.out.println("the sum of 4 and 5 is " + sum(4,5));
//        System.out.println("the sum of 4 5 and 6 is " + sum(4,5,6));
        System.out.println(sum(1,2,3,4,5));
    }
}

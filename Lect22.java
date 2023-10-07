// some practice

package com.company;

public class Lect22 {
//    table
//    static void multiplication(int n){
//        for (int i=1;i<=10;i++){
////            System.out.println(n*i);
//            System.out.format("%d X %d = %d\n",n,i,n*i);
//        }
//    }

//    pattern 1
//    static void pattern1(int n){
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    //pattern 2
    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }


//    pattern using recursion
//    static void patter(int n){
//        if(n>0){
//            patter(n-1);
//            for (int i=0;i<n;i++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }


    //sum of n natural numbers using recursion
//    static int sumrec(int n){
////        base condition
//        if(n==1){
//            return 1;
//        }
//        return n + sumrec(n-1);
//    }
    public static void main(String[] args) {
//        multiplication(7);
//        pattern1(6);
        pattern2(2);

//        int c  = sumrec(5);
//        System.out.println(c);

//        patter(7);
    }
}

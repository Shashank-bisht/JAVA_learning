//fibonacci series

package com.company;

public class Lect21 {
//    static int fibo(int n){
//        if(n==0){
//            return 0;
//        }
//        else if(n==1){
//            return 1;
//        }
//        else {
//            return fibo(n-1)+fibo(n-2);
//        }

//    }
    public static void main(String[] args) {

//        System.out.println("fibonachhi of no. is " + fibo(6));
        int [] marks = {1,2,3,4};
        int num = 7;
       boolean isarr = false;
        for(int element:marks) {
            if (num == element) {
                isarr = true;
                break;
            }
        }
            if(isarr){
                System.out.println("the value is present in array");
            }
            else{
                System.out.println("the value is not present in array");
            }
        }

    }


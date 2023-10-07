// recursion
// a function  in java can call itself such calling is called recursion

package com.company;

public class Lect20 {

//    using recursive approach

//    static int factorial(int n){
//        if(n==0 || n==1){
//            return 1;
//        }
//        else {
//            return n*factorial(n-1);
//        }
//    }


//    using iterative approach
    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            int product = 1;
            for (int i=1;i<=n;i++){
                product *=i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
//        System.out.println("The value of factorial n i "+factorial(4));
        System.out.println("The value of factorial n is " +factorial_iterative(4));
    }
}

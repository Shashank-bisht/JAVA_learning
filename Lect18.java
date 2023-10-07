//void-> we do not want to return anything
// static is used for sharing

package com.company;

public class Lect18 {
    static void telljoke(){
        System.out.println("tatti kha!!");
    }

//    method overloading

    static void foo(int a){
        System.out.println("your age is "+a);
    }
    static void foo(){
        System.out.println("hello");
    }
    static void change(int [] arr){
        arr[0] = 98;
    }
// array change ho raha hai but int nahi
    public static void main(String[] args) {
//        telljoke();
        int [] marks = {12,2,3,44,55,66,66};
        change(marks);
        System.out.println(marks[0]);

//        we can use same method name but parameter should be different

//        foo();
//        foo(19);

//        we cannot use method overloading by change return type like from void to int
    }
}



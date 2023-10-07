//abstract classes and interface
// abstract class is a class which help in the formation of other class
// in abstract class we cannot extends more then one class

package com.company;
 abstract class parent2{
    public parent2(){
        System.out.println("mai base 2 ka constructor hu");
    }
    public void sayhello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    };

class child2 extends parent2{
     @Override
     public void greet(){
         System.out.println("good morning");
        }
 }


public class Lect38 {
    public static void main(String[] args) {

//        parent2 p = new parent2(); //shows error because parent 2 is an abstract class

        child2 c = new child2(); // it will run because it does not have abstract
//        c.greet();
        c.sayhello();
    }
}

// our first class

package com.company;
class Employee{
    int id;
    String name;
    public void printdetails(){
        System.out.println("my name is "+ name);
        System.out.println("my Id is "+ id);
    }
}
public class Lect23 {
    public static void main(String[] args) {
        Employee harry = new Employee(); //instanting a new Employee object
        Employee john = new Employee(); //instanting a new Employee object

        // setting attributes for harry
        harry.id = 11;
        harry.name = "shanky";

//        setting attribute for john
        john.id = 111;
        john.name = "jooony";

//        printing the attributes

//        System.out.println(harry.name);
//        System.out.println(harry.id);
        harry.printdetails();
        john.printdetails();
    }
}

package com.company;
class mythr extends Thread{
    public mythr(String name){
        super(name);
    }
    public void run(){
        System.out.println("hllo");
    }
}
public class Lect51 {
    public static void main(String[] args) {
        mythr t1 = new mythr("shanky");
        mythr t2 = new mythr("raju");
        t1.start();

        System.out.println("the id of thread t1 is " + t1.getId());
        System.out.println("the id of thread t1 is " + t1.getName());
        System.out.println("the id of thread t1 is " + t2.getId());
        System.out.println("the id of thread t1 is " + t2.getName());

    }
}

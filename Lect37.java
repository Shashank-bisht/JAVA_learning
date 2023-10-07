//dynamic method dispatch
// new object is made in run time

package com.company;
class phone{
    public void showtime(){
        System.out.println("show the time");
    }
    public void on(){
        System.out.println("Turning on phone.....");
    }
}
class smartphone extends phone{
    public void music(){
        System.out.println("playing the music");
    }
    public void on(){
        System.out.println("Turning on smartphone....");
    }
}
public class Lect37 {
    public static void main(String[] args) {
        phone o = new phone();
//        o.on();
//        o.music(); //cannot run
//        phone o = new smartphone();
//        smartphone o = new phone(); //not allowed
//        o.showtime();
//        o.on(); // new wala run hoga

//        o.music(); // it will not run

    }
}

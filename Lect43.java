//polymorphism in interface

package com.company;
interface mycamera{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4kvideo(){
     greet();
        System.out.println("Recording in 4k....");
    }
}
interface mywifi{
    String[] getnetwork();
    void connecttonetwork(String network);
}
public class Lect43 {
    public static void main(String[] args) {

    }
}

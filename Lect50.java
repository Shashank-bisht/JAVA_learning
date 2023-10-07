//creating thread using runnable interface

package com.company;
class mythreadrunnable1 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i<100){
            System.out.println("I am a thread 1");
            i++;
        }

    }
}
class mythreadrunnable2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("I am a thread 2");
            i++;
        }
    }
}
public class Lect50 {
    public static void main(String[] args) {
        mythreadrunnable1 allu1 = new mythreadrunnable1();
        Thread samosa1 = new Thread(allu1);
        mythreadrunnable2 allu2 = new mythreadrunnable2();
        Thread samosa2 = new Thread(allu2);

        samosa1.start();
        samosa2.start();
    }
}

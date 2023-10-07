//inheritance in interface
//using multiple interface we can create a class

package com.company;

interface sampleinterface{
    void meth1();
    void meth2();
}
interface childsampleinterface extends sampleinterface{
    void meth3();
    void meth4();
}

//class will take dna of sampleinterface

class mysampleclass implements childsampleinterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");

    }

}

public class Lect42 {
    public static void main(String[] args) {
        mysampleclass m = new mysampleclass();
        m.meth1();
//        all methods should be defined here
    }
}

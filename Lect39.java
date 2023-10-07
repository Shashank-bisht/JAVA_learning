//Interface - group of methods whose implementation is necessary
// public banana padiga
//in interface we can implement more then one class

package com.company;

interface bicycle{
    int a = 44;
    void applybrakes(int decrement);
    void speedup(int increment);
}
interface blowhrn{
    void blwhr1();
    void blwhr2();
}

class Avoncycle implements bicycle,blowhrn{
    void blowhorn(){
        System.out.println("pi po");
    }
    public void applybrakes(int decrement){
        System.out.println("Apply brake");
    }
    public void speedup(int increment){
        System.out.println("speed up");
    }
    public void blwhr1(){
        System.out.println("tatti");
    }
    public void blwhr2(){
        System.out.println("huggy");
    }
}
public class Lect39 {
    public static void main(String[] args) {
        Avoncycle cyc = new Avoncycle();
        cyc.applybrakes(2);
//        you can create properties in interface
        System.out.println(cyc.a);
//        System.out.println(bicycle.a);

//        you cannot modify the properties in interface as they are final
//        cyc.a = 44;

        cyc.blwhr1();
        cyc.blwhr2();
    }
}

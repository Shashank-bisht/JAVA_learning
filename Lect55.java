//practice on abstract

package com.company;
//abstract class pen{
//    abstract void write();
//    abstract void refill();
//}
//class fountainpen extends pen{
//    @Override
//    void write() {
//        System.out.println("write");
//    }
//
//    @Override
//    void refill() {
//        System.out.println("refill");
//    }
//    void changenip(){
//        System.out.println("changing nip");
//    }
//}



class monkey{
    void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("biting");
    }
}
interface basicanimal{
    void eat();
    void sleep();
}
class human extends monkey implements basicanimal{
    void speak(){
        System.out.println("hello");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }
}
public class Lect55 {
    public static void main(String[] args) {
//        fountainpen f = new fountainpen();
//        f.changenip();

       human shanky = new human();
       shanky.eat();

       monkey m1 = new human();
       m1.bite();
       m1.jump();
//       m1.sleep();

        basicanimal sar = new human();
        sar.eat();

    }
}

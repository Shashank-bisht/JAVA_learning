//constructor in inheritance

package com.company;
class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(String x){
        System.out.println("I am an overloded constructor with name : " + x);
    }
   public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1{
    Derived1(){
//        to get constructor with argument we will use super
        super("shanky");
        System.out.println("I am a derived constructor");
    }
    Derived1(int x , int y){
        super();
        System.out.println("i am an overloaded constructor of derived with value x as " + x);

    }
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class childofderived extends Derived1{
    childofderived(){
        System.out.println("I am child of derived constructor");
    }
    childofderived(int x, int y, int z){
        super(x, y);
        System.out.println("i am an overloaded constructor of derived with value y as " + y);
    }
}
public class Lect30 {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        phele base wla constructor run hoga then derived vala
//        Derived1 d = new Derived1();
//        Derived1 d = new Derived1(3,4);
//        childofderived cd = new childofderived();
        childofderived cd = new childofderived(1,2,3);
    }
}

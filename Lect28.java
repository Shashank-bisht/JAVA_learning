// inheritance in java

package com.company;

class Base{
    int x;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }


    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Lect28 {
    public static void main(String[] args) {

//        creating an object of derived class
        derived b = new derived();
//        derived d = new derived();
//        d.setY(33);
//        System.out.println(d.getY());
//        object derived class ka banaya and using methods of base class

//        creating an object of base class
//        Base b = new Base();
        b.setX(19);
        System.out.println(b.getX());

    }
}

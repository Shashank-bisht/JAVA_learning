package com.company;

class Cylinder{
    private int radius;
    private int hight;

    public Cylinder(int radius, int hight) {
        this.radius = radius;
        this.hight = hight;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }
    public int surfacearea(){
        return (int) (2*3.14*radius*radius + 2*3.14*radius*hight);
    }
}
public class Lect35 {
    public static void main(String[] args) {
//        using constructor
        Cylinder myclinder = new Cylinder(10,11);

//        Cylinder myclinder = new Cylinder();
//        myclinder.setHight(11);
//        myclinder.setRadius(10);
//        System.out.println(myclinder.getHight());
        System.out.println(myclinder.surfacearea());
    }
}

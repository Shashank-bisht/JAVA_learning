package com.company;
class circle1{
    private double radius;
    private double area;
    private double perimeter;
    public void setradius(double x){
        x=radius;
    }public void setarea(double y){
        double a = 3.14f * radius * radius;
        if(y == a){
            area= y;
            System.out.println("That is Right!");
        }else{
            System.out.println("You Enter the wrong value!");
        }
    }public void setperimeter(double p){
        double b = (2 * 3.142f) * radius;
        if(p == b){
            p =perimeter;
            System.out.println("That is Right!");
        }else{
            System.out.println("You Enter the Wrong value!");
        }
    }
}
public class gspractice {
    public static void main(String[] args) {
        circle1 c= new circle1();
        c.setradius(7);
        c.setarea(54.54f);
        c.setperimeter(44);
    }
}

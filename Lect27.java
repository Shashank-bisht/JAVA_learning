//oops practice


package com.company;

//class emplyee{
//    int salary;
//    String name;
//    public int getSalary(){
//        return salary;
//    }
//    public String getname(){
//        return name;
//    }
//    public void setName(String n){
//        name = n;
//    }
//    public void setSalary(int s){
//        salary = s;
//    }
//}
//class cellphone{
//    public void ringing(){
//        System.out.println("Ringing");
//    }
//    public void vibrating(){
//        System.out.println("vibrating...");
//    }
//}

//class square{
//    int side;
//    public void setSide(int s){
//        side = s;
//    }
//    public int area(){
//        return side*side;
//    }
//    public int perimeter(){
//        return 4*side;
//    }
//}


class rectangle{
    int width;
    int height;
    public void setWidth(int w){
        width=w;
    }
    public void setHeight(int h){
        height=h;
    }
    public int area(){
        return width*height;
    }
    public int perimeter(){
        return 2*(width+height);
    }
}
public class Lect27 {
    public static void main(String[] args) {
//        emplyee shanky = new emplyee();
//        emplyee hanky = new emplyee();
//        shanky.setName("shanku");
//        System.out.println(shanky.getname());
//        shanky.setSalary(50000);
//        System.out.println(shanky.getSalary());

//        cellphone iphone = new cellphone();
//        iphone.ringing();
//        iphone.vibrating();

//        square sq = new square();
//        sq.setSide(4);
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());

        rectangle r = new rectangle();
        r.setHeight(14);
        r.setWidth(4);
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}

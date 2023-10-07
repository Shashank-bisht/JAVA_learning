package com.company;
class animal{
    int age;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String breed;
}
class dog extends animal{
//    is class mai kuch bhi nahi hai phir bhi mai dog ki breed jan sakta hu

    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public class Lect29 {
    public static void main(String[] args) {
        dog sandy = new dog();
        sandy.setAge(19);
        System.out.println(sandy.getAge());
        sandy.setBreed("pug");
        System.out.println("This is dog breed derived from animal breed");
        System.out.println(sandy.getBreed());

        animal x = new animal();
        System.out.println();
        x.setBreed("pug");
        System.out.println("This is animal breed");
        System.out.println(x.getBreed());

        sandy.setColor("pink");
        System.out.println(sandy.getColor());

    }
}

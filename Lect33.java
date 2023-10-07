//This and Super keyword

//This is a way for us to reference an object of tha class which is being created

package com.company;
class Ekclass{
    int a;

    public int getA() {
        return a;
    }

    Ekclass(int a){
//        this.a = a;
        a = a; // code will not run
    }
    public int returnone(){
        return 1;
    }
}
//class doclass extends Ekclass
public class Lect33 {
    public static void main(String[] args) {
        Ekclass e = new Ekclass(5);
        System.out.println(e.getA());
    }
}

//Example this.area = 6
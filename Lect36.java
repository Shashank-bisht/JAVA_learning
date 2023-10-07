//this and super
//this is a reference to set reference

package com.company;
class Ekclass1{
    int a;

    public int getA() {
        return a;
    }

    Ekclass1(int v){
        this.a = v;
    }
    public int returnone(){
        return 1;
    }
}
class doclass extends Ekclass1{
//
    doclass(int c){
//         super invoke that constructor which have  any argument

        super(c);
        System.out.println("i am a constructor");
    }
}

public class Lect36 {
    public static void main(String[] args) {
        Ekclass1 e = new Ekclass1(333);
        doclass d = new doclass(77);
        System.out.println(e.getA());
    }
}

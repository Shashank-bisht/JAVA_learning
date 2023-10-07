// java methods -> dry


package com.company;

public class Lect17_methods {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x*y;
        }
        else {
            z = (x+y)*5;
        }
//        x = 1000; //it will not effect the value of a and b
        return z;
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
//        Lect17_methods obj = new Lect17_methods(); // create obj and remove static from top
//        c = obj.logic(a,b);
        c = logic(a,b);

//        int a1 = 10;
//        int b1 = 2;
//        int c1;
//        c1 = obj.logic(a1,b1); // using obj formation we have to remove static from the top
//        c1 = logic(a1,b1);
        System.out.println(c);
//        System.out.println(c1);

    }
}

// for and for each loop

package com.company;

public class Lect15 {
    public static void main(String[] args) {
        int [] marks = {98, 45, 79, 99, 88};
        //      String [] names = {"shanky","shashank","pari"};
//        System.out.println(names.length);
//        System.out.println(marks[1]);
        System.out.println(marks.length);

//        displaying array -> using for loop

//        for (int i=0; i<marks.length;i++){
//            System.out.println(marks[i]);
//        }
//        in reverse order
//        for(int i=marks.length-1;i>=0;i--){
//            System.out.println(marks[i]);
//        }

//        printing using for each loop
        for(int element:marks){
            System.out.println(element);
        }
    }
}

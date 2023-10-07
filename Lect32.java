//Array practice

package com.company;

public class Lect32 {
    public static void main(String[] args) {
//        array of 4 float and thier sum
        float [] marks= {44.5f, 33.4f, 44.4f, 31.4f};
        float sum = 0;
        for(float element:marks){
            sum+=element;
        }
        System.out.println("the value of sum is " + sum);
    }
}

//custom exception

package com.company;

import java.util.Scanner;

class myexception extends Exception{
    @Override
    public String toString() {
        return super.toString()+ "i am toString()";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "i am getMessage()";
    }
}
public class Lect46 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<8){
            try{
                throw new myexception();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
}
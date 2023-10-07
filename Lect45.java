//nested try catch block

package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Lect45 {
    public static void main(String[] args) {
        int [] x = new int[3];
        x[0] = 1;
        x[1] = 2;
        x[2] = 12;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of array");
        int y = sc.nextInt();
        try{
            System.out.println("hello");
            try {
            System.out.println("the number in array is "+ x[y]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("out of index");
            System.out.println(e);
            System.out.println("Exception 1");
        }
        }
        catch (Exception e){
            System.out.println("Exception 2");
        }

    }
}

// in starting first try will work then second try will work then first catch will run then next catch will run
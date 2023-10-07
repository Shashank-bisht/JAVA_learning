//handling specific exception

package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Lect44 {
    public static void main(String[] args) {
        int [] mrk = new int[4];
        mrk[0] = 3;
        mrk[1] = 32;
        mrk[2] = 34;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int num = sc.nextInt();
        try{
            System.out.println("the value of array index is" + mrk[ind]);
            System.out.println("the value of array-value/number is "+ mrk[ind]/num);
        }

        catch (ArithmeticException e){
            System.out.println("some exception occured");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("some exception occured");
            System.out.println(e);
        }

    }
}

//throws is an indication that a program can throw error and throw actually throw an exception to the user

package com.company;

class negativeradiusexception extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative!";
    }
    @Override
    public String getMessage(){return "Radius cannot be negative";}
}

public class Lect48 {
    public static double area(int r) throws negativeradiusexception{
        if(r<0){
            throw new negativeradiusexception();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static void main(String[] args) {
        try {
            double ar = area(-6);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println("Exception");
        }
    }
}

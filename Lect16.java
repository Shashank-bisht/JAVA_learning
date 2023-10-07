//1D , 2D , 3D arrays

package com.company;

public class Lect16 {
    public static void main(String[] args) {
//        int [] marks; // 1D array
        int [] [] flats; // 2D array
        flats = new int[2][3];  // assume 2 row and 3 column
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

//        displaying 2d array using for loop
        System.out.println("printing a 2d array using for loop");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}

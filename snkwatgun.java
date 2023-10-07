


package com.company;

import java.util.Random;
import java.util.Scanner;

public class snkwatgun {
    public static void main(String[] args) {
        String[] lst = {"s","w","g"};
        int chance = 10;
        int no_of_chance = 0;
        int computer_point = 0;
        int human_point = 0;
        System.out.println(" \t \t \t \t Snake,Water,Gun Game\n \n");
        System.out.println("s for snake \nw for water \ng for gun \n");
        while (no_of_chance<chance){
            System.out.println("Snake,Water,Gun:");
            Scanner val = new Scanner(System.in);
            String _input = val.nextLine();
            Random r = new Random();
            int randomNumber=r.nextInt(lst.length);
            System.out.println(lst[randomNumber]);

            if(_input == lst[randomNumber]){
                System.out.print("\n tie 1 point to each");
                computer_point = computer_point + 1;
                human_point = human_point + 1;
                System.out.print("computer point is "+ computer_point+"human point is "+ human_point +"\n");
            }
// if user enter s
            else if(_input == "s" && lst[randomNumber] == "w"){
                human_point = human_point + 1;
                System.out.print("your guess is"+_input+"and computer guess is "+lst[randomNumber]);
                System.out.println("human win 1 point ");
                System.out.println("computer point is "+ computer_point+"human point is "+ human_point);
            }
            else if(_input =="s" && lst[randomNumber] =="g"){
                computer_point = computer_point + 1;
                System.out.print("your guess is"+_input+"and computer guess is "+lst[randomNumber]);
                System.out.println("computer win 1 point ");
                System.out.println("computer point is "+ computer_point+"human point is "+ human_point);
            }
//  if user enter w
            else if(_input =="w" && lst[randomNumber] =="g"){
                human_point = human_point + 1;
                System.out.print("your guess is"+_input+"and computer guess is "+lst[randomNumber]);
                System.out.println("human win 1 point ");
                System.out.println("computer point is "+ computer_point+"human point is "+ human_point);
            }
            else if(_input =="w" && lst[randomNumber] =="s"){
                computer_point = computer_point + 1;
                System.out.print("your guess is"+_input+"and computer guess is "+lst[randomNumber]);
                System.out.println("computer win 1 point ");
                System.out.println("computer point is "+ computer_point+"human point is "+ human_point);
            }
//            if user enter g
            else if(_input =="g" && lst[randomNumber] =="w"){
                computer_point = computer_point + 1;
                System.out.print("your guess is"+_input+"and computer guess is "+lst[randomNumber]);
                System.out.println("computer win 1 point ");
                System.out.println("computer point is "+ computer_point+"human point is "+ human_point);
            }
            else if(_input=="g" && lst[randomNumber]=="s"){
                human_point = human_point + 1;
                System.out.print("your guess is"+_input+"and computer guess is "+lst[randomNumber]);
                System.out.println("human win 1 point ");
                System.out.println("computer point is "+ computer_point+"human point is "+ human_point);
            }
            else {
                System.out.println("you print wrong input");
            }
            no_of_chance = no_of_chance+1;
            System.out.println("you have "+ (chance - no_of_chance) +" chance out of " + chance );
        }
        System.out.println("Game over");
        if(computer_point==human_point){
            System.out.println("tie");
        }
        else if(computer_point<human_point){
            System.out.println("human won");
        }
        else {
            System.out.println("computer won");
        }
        System.out.println("human point is "+human_point+" and computer point is "+ computer_point);
    }
}

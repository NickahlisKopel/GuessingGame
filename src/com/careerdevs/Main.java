package com.careerdevs;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        guessTheNumber();
        while (!done){
        System.out.println("Would you like to play again?");
        String again = scanner.nextLine();

            if(Objects.equals(again, "y") || Objects.equals(again, "yes")){
                guessTheNumber();
            }else{
                done = true;
            }
        }



    }
    public static void guessTheNumber(){
        Scanner scanner = new Scanner(System.in);
        boolean complete = false;

        System.out.print("Max number: ");
        int range = scanner.nextInt();
        int random = (int)(Math.random()*range);
        while(!complete){
            System.out.print("Guess a number between 0-"+range+": ");
            int guess = scanner.nextInt();
            if(guess == random) {
                System.out.println("You did it!");
                complete = true;
            }else{
                System.out.println("Wrong Number!");
                if(guess > random){
                    System.out.println("Too High!");
                }else{
                    System.out.println("Too Low!");
                }
            }
        }
    }
}

package CHALLANGES;

import java.util.Scanner;

public class Challange_no_60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 5, guess;
        System.out.println("Welcome to number gussing game");
        do{
            System.out.println("Please guess the number between 0 to 10: ");
            guess = input.nextInt();
        }while (num != guess);
        System.out.println("You have successfully guessed the number");

    }

}

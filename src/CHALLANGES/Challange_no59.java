package CHALLANGES;

import java.util.Scanner;

public class Challange_no59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to set your password");
        String password;
        do{
            System.out.println("Please Enter your password: ");
            password = input.next();
        }while(!isValidPassword(password));
        System.out.println("Thanks for entering the valid password");

    }
    public static boolean isValidPassword(String Password) {
        return Password.length() > 6;
    }
}

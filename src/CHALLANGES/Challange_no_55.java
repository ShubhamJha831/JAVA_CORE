package CHALLANGES;

import java.util.Scanner;

public class Challange_no_55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Absolute value\n");
        System.out.println("please enter your number: ");
        int num = input.nextInt();
        int result = num >= 0 ? num : -num;
        System.out.println("Absolute value is:"+" "+ result);
    }
}

package CHALLANGES.Challange_no87;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my calculator");

        System.out.println("Enter your first number");
        int n1 = input.nextInt();

        System.out.println("Enter your second number");
        int n2 = input.nextInt();

        try {
            float result = (float) n1 / n2;
            System.out.printf("Result is %.2f", result);
        } catch (ArithmeticException ah) {
            System.out.println("Please enter the correct value, your value is invalid (maybe division by zero).");
        } catch (Exception ex) {
            System.out.println("You did something wrong: " + ex.getMessage());
        }
    }
}

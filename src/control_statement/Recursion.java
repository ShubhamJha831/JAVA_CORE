package control_statement;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my code who finds the factorial of a number");
        System.out.println("Enter the number who's Factorial you want to find: ");
        int num = input.nextInt();
        long fact = Factorial(num);
        System.out.println("Factorial of your number is: " + fact);
    }
    public static long Factorial(int num){
        System.out.println("Function called for: " + num);
        if (num == 1){
            return 1;
        }
            return num * Factorial(num - 1);
    }
    public static long FactorialIterative(int num){
        long result =  1;
        for (int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }
}

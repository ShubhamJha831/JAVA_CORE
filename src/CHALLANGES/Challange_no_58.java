package CHALLANGES;

import control_statement.Switch;

import java.util.Scanner;

public class Challange_no_58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my calculator\n");
        System.out.println("Enter value of A");
        Float  a = input.nextFloat();
        System.out.println("Enter value of B");
        Float b = input.nextFloat();
        System.out.println("Enter operator : ");
        char operator = input.next().charAt(0);
        switch (operator) {
            case '%':
                System.out.println(a % b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '/':
                System.out.println(a / b);
            default:
                System.out.println("Invalid operator");
                break;
        }
    }

}

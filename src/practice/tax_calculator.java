package practice;

import java.util.Scanner;

import java.util.Scanner;

public class  tax_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float income = sc.nextFloat();
        float tax;
        if (income < 500000.0F) {
            tax = 0.0F;
        } else if (income >= 500000.0F && income < 1000000.0F) {
            tax = (float)((double)income * 0.2);
        } else {
            tax = (float)((double)income * 0.3);
        }

        System.out.println("your tax is " + tax);
    }
}

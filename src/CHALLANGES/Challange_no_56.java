package CHALLANGES;

import java.util.Scanner;

public class Challange_no_56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to my code\n");
        System.out.println("Enter your Marks: ");
        int marks = input.nextInt();

        String category = marks > 80 ? "high" : (marks > 50 ? "moderate" : "low");
        System.out.println("your category is: " + category);
    }
}

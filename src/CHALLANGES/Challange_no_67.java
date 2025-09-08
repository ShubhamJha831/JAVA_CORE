package CHALLANGES;

import java.util.Scanner;

public class Challange_no_67 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of num:");
        int num = input.nextInt();
        int sum = 0;

        // Iterate from 1 up to num
        for (int i = 1; i <= num; i++) {
            // Check if the current number (i) is even
            if (i % 2 == 0) {
                sum += i; // Add even numbers to the sum
            }
        }
        System.out.println("The sum of even numbers up to " + num + " is: " + sum);
        input.close(); // Close the scanner to prevent resource leaks
    }
}
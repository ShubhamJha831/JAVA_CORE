package CHALLANGES;

import java.util.Scanner;

public class Challange_no_61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to printing table\n");
        System.out.println("Enter the number: ");

        int num = input.nextInt();

        for (int i = 1; i <= 10; i++ ){
            System.out.println(num + "x"+ i + "=" + (num * i));
        }
    }
}

package CHALLANGES;

import java.util.Scanner;

public class challange_no53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to my code");
        System.out.println("Enter your First number: ");
        int Num1 = input.nextInt();
        System.out.println("Enter your Second number: ");
        int Num2 = input.nextInt();

        int minimumNumber = Num1 < Num2 ? Num1 : Num2;

        System.out.println(minimumNumber + " " + "is the minimum number");
    }

}

package CHALLANGES;

import java.util.Scanner;

public class challange_num54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num = input.nextInt();

        String evenorodd = (num % 2 == 0) ? "even" : "odd";
        System.out.println("the number is"+" "+evenorodd);
    }
}

package CHALLANGES;

import java.util.Scanner;

public class Challange_no_68 {
    public static void main(String[] args) {
        Scanner inpput = new Scanner(System.in);
        System.out.println("Welcome to fibonacci Series");
        System.out.println("Enter the number of elements to be printed: ");
        int count = inpput.nextInt();
        for (int i = 1; i <= count; i++){
            System.out.print(fibonacci(i)+ " ");
        }
    }
    public static int fibonacci(int position){
        if (position == 1){
            return 0;
        }
        if (position == 2){
            return 1;
        }

        return fibonacci(position - 1) + (fibonacci(position - 2));
    }
}

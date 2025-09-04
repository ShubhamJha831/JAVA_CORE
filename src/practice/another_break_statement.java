package practice;
import java.util.Scanner;

public class another_break_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("enter a number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println("Its multiple of 10");
                return;
            }

            System.out.println(n);
        }
    }
}


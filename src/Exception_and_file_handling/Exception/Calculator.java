package Exception_and_file_handling.Exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        a();

    }

    private static void a(){
        b();
    }
    private static void b(){
        c();
    }
    private static void c(){
        d();
    }
    private static void d(){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to division Calculator");
        System.out.println("Please enter your two numbers: ");

        int first = input.nextInt();

        int second = input.nextInt();
        try {
            int[] a = new int[5];
            System.out.printf("Result is %d", a[6]);
            a[6] = first / second;
            System.out.printf("Result is %d", a[6]);
            int result = first / second;
            System.out.printf("Result is %d", result);
        }catch (ArithmeticException wrong){

            System.out.printf("%s, enter valid values", wrong.getMessage());
        }catch (Throwable th){
            System.out.println("Something went wrong");
            throw th;
        } finally {
            System.out.println("I am in finally");

        }
    }
}

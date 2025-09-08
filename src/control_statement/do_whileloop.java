package control_statement;

import java.util.Scanner;

public class do_whileloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Please Enter your age\n");
//        int age = input.nextInt();
//        while(age < 0 || age > 100){
//            System.out.println("please enter your age: ");
//            age = input.nextInt();
        int age;
        do{
            System.out.println("Please Enter your age\n");
            age = input.nextInt();
        }while(age < 0 || age > 100);
        System.out.println("your age is: " + age);
    }
}

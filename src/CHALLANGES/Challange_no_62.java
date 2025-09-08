package CHALLANGES;

import java.util.Scanner;

class Challange_no_62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to prime number checker");
        int num = input.nextInt();
        boolean isprime = isprime(num);
        System.out.println("Your number is" + (isprime ? "prime" : "Not prime"));

    }
    public static boolean isprime(int num){
        for (int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}

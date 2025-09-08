package CHALLANGES;

import Arrays.arrayUtility;

import java.util.Scanner;

class Challange_no_66 {
    public static void main(String[] args) {
        System.out.println("Welcome to adding positive numbers.");
        int[] numArr = arrayUtility.inputArray();

        int sum = 0;
        for (int num : numArr){
            if (num < 0){

            continue;
            }
        sum += num;
        }
        System.out.println("The sum of positive number is: " + sum);
    }
}


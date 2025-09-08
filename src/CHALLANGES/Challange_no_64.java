package CHALLANGES;

import Arrays.arrayUtility;

import java.util.Scanner;

class Challange_no_64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding occurrences");
        int[] arr = arrayUtility.inputArray();
        System.out.println("Now, Enter the number you want to search: ");
        int element = input.nextInt();
        int occ = CountOccurrences(arr,element);
        System.out.println("Your element was found: " + occ + " times.");
    }
    public static int CountOccurrences(int[] nums, int element){
        int occ = 0;
        for (int num : nums){
            if(num == element){
                occ++;
            }
        }
        return occ;
    }
}

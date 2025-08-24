package challanges;

import java.util.Scanner;

public class array_utility {




     static int[] inputArray() {

        System.out.println("welcome to array sum and average");
        System.out.println("please enter the number of element");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while(i < size){
        System.out.println("please enter element no" + (i + 1) + ": ");
        nums[i] = input.nextInt();
        i++;
        }
        return nums;
    }
}

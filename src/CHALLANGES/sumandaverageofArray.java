package CHALLANGES;

import java.sql.SQLOutput;
import Arrays.arrayUtility;

class sumandaverageofArray {
    public static void main(String[] args) {
        System.out.println("welcome to array sum and average");
        int [] numArray = arrayUtility.inputArray();
        long sum = sum (numArray);
        int avg = Average(numArray);
        System.out.println("sum of the numbers is : " + sum);
        System.out.println("Average of the numbers is: " + avg);

    }
    public  static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while(i < numArray.length){
            sum += numArray[i];
        }
        return 0;
    }

    public static int Average(int[] numArray) {
        long sum = sum(numArray);
        return (int) (sum / numArray.length);
    }

}


import java.util.Scanner;
public class arraaysearching {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [] arr = {15, 51, 266, 652, 263, 263};
        System.out.println("welccome to array searching\n");
        System.out.println("Enter tha number you want to search: ");
        int num = input.nextInt();
        boolean isfound = isfound(arr, num);
        if(isfound){
            System.out.println("your number is found in the array");
        }else {
            System.out.println("your number was not found");
        }

    }
    public static boolean isfound(int[] arr , int num){
        int index = 0;
        while(index < arr.length){
            if (arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }

}

package control_statement;
import java.util.Scanner;

public class turnery_operater {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("welcome to number chacker\n");
        System.out.println("please enter your first number: ");
        int num1 = input.nextInt();
        System.out.println("please enter your second number: ");
        int num2 = input.nextInt();
//        if(num1 > num2){
//            System.out.println("num1 is your greater number!");
//
//        }else{
//            System.out.println("num2 is your greater number!");
//        }
        int greaternumber = num1 > num2 ? num1 : num2;
        System.out.println(greaternumber + " " + "is the greater number");
    }

}

package CHALLANGES;

import java.util.Scanner;

public class Challange_no_65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter your connamd: ");
            String command = input.next();
            if(command.equalsIgnoreCase("exit")){
                break;
            }
        }
        System.out.println("You have successfully exit");
    }
}

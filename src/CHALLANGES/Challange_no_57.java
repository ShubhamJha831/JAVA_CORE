package CHALLANGES;

import java.util.Scanner;

public class Challange_no_57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Day of the week detector\n");
        System.out.println("Enter your Day  in number: ");
        int day = input.nextInt();
        //oldSwitch(day);
        newSwitch(day);

    }

    public static void newSwitch(int month) {
        String monthstr = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid";
        };
        System.out.println(monthstr);

    }
}

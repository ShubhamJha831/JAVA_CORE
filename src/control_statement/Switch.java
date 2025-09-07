package control_statement;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Day of the week detector\n");
        System.out.println("Enter your Day  in number: ");
        int day = input.nextInt();
        //oldSwitch(day);
        newSwitch(day);

    }

    public static void newSwitch(int day ) {
        String daystr = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesay";
            case 4 -> "thursday";
            case 5 -> "Friday";
            case 6 -> "saturday";
            case 7 -> "sunday";
            default -> "Invalid";
        };
        System.out.println(daystr);

    }
    public void oldSwitch(int day){
        switch (day){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("saturday");
                break;
            case 7 :
                System.out.println("sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

}

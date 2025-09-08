package CHALLANGES;

import java.util.Scanner;

class Challange_no_69 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to palindrome number checker\n");
        System.out.println("Enter the string to be checked: ");
        String str = input.next();
        System.out.println("Your string is" + " " + ((isPalindrome(str) ? "Palindrome" : "Not palindrome")));
    }
    public static boolean isPalindrome(String str){
        if(str.length() <= 1){
            return true;
        }
        int lastpos = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastpos)){
            return false;
        }
        String newstr = str.substring(1, lastpos);
        return isPalindrome(newstr);
    }
}

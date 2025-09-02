package practice;

public class print_reverse_of_number {
    public static void main(String[] args) {
        int n = 10899;

        int rev;
        for(rev = 0; n > 0; n /= 10) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
        }

        System.out.println(rev);
    }
}



package CHALLANGES;

import java.util.Scanner;

class GussinGame {
    int random;

    GussinGame() {
        random = (int)(Math.random() * 100) + 1; // ensures 1 to 100
    }

    int guess(int guessNumber) {
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GussinGame game = new GussinGame();
        System.out.println("Welcome to the guessing game! Guess the number between 1 to 100");
        int guess;
        int result;
        do {
            System.out.print("Guess the number: ");
            guess = input.nextInt();
            result = game.guess(guess);
            if (result == 0) {
                System.out.println("Congrats! Your guess is correct 🎉");
            } else if (result < 0) {
                System.out.println("Please guess higher ↑");
            } else {
                System.out.println("Please guess lower ↓");
            }
        } while (result != 0);
        input.close();
    }
}

package inherit.abstractclass;

import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess;
        int number = (int) (Math.random() * 10);
        do {
            System.out.println("Please input number to guess :");
            guess = scanner.nextInt();
        } while (guess != number);

        System.out.println("You guessed it !");
    }
}

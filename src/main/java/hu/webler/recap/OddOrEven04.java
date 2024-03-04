package hu.webler.recap;

import java.util.Scanner;

public class OddOrEven04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        do {
            System.out.println("Kérlek adj meg egy számot: ");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                playAgain = true;
            } else {
                System.out.println("Ez a szám páratlan! A játéknak vége!");
                playAgain = false;
            }
        } while (playAgain);
    }
}

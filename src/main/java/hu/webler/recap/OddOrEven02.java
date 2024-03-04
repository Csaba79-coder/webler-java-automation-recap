package hu.webler.recap;

import java.util.Scanner;

public class OddOrEven02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Kérlek adj meg egy számot: ");
            int number = scanner.nextInt();
            if (number % 2 != 0) {
                System.out.println("Ez a szám páratlan! A játéknak vége!");
                playAgain = false;
            }
        }
    }
}

package hu.webler.recap;

import java.util.Scanner;

public class OddOrEven03 {

    public static void main(String[] args) {

        String text = askUserInteraction("Kérek egy számot:");
        System.out.println(text);

        while (checkEvenOrOdd()) {
            System.out.println(text);
        }

    }
    private static boolean checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            return true;
        } else {
            System.out.println("Ez a szám páratlan! A játéknak vége!");
            return false;
        }
    }

    private static String askUserInteraction(String text) {
        return text;
    }
}

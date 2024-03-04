package hu.webler.recap;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kezdő szám:");
        int start = scanner.nextInt();
        System.out.println("Végszám:");
        int end = scanner.nextInt();

        int length = countNumber(start, end); // meg kell számolnom, hogy szám jön szóba közbe!
        int[] numbers = new int[length];
        int index = 0;

        // System.out.println(length);
        // 2, 4, 6, 8
        // 0, 1, 2, 3
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                numbers[index] = i;
                index++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        // System.out.println(Arrays.asList(numbers).toString());
        // tömb nehézsége, előre kell tudni a hosszát!
    }

    private static int countNumber(int start, int end) {
        int counter = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}

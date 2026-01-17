package gr.aueb.cf.cf9.review_challenges;

import java.util.Scanner;

/**
 * Γράψτε μια μέθοδο που δέχεται δύο ακεραίους
 * και επιστρέφει το άθροισμά τους.
 */

public class SumOfTwo {

    public static void main(String[] args) {
        int sum = 0;
        int a = 10;
        int b = 15;

        System.out.println("Το άθροισμα των " + a + " και " + b + " ισούται με " + sumOfTwo(a, b) +".");

    }

    public static int sumOfTwo (int a, int b) {

        return a + b;
    }
}

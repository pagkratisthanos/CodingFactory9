package gr.aueb.cf.cf9.review_challenges;

import java.util.Arrays;

/**
 * Δίνεται ένας πίνακας ακεραίων.
 * Να υπολογιστεί το άθροισμα των στοιχείων του.
 */

public class SumOfArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        System.out.println("Το άθροισμα των στοιχείων του πίνακα " + Arrays.toString(arr) + " είναι :\n" + sumArray(arr));

    }

    public static int sumArray (int[] arr) {

        return Arrays.stream(arr).sum();
    }


}

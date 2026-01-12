package gr.aueb.cf.cf9.review_challenges.find_max;

import java.util.Arrays;

/**
 * Γράψτε μια μέθοδο που δέχεται έναν πίνακα ακεραίων
 * και επιστρέφει τον μεγαλύτερο αριθμό.
 */

public class FindMax {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println("Ο μέγιστος αριθμός του πίνακα είναι το: " + findMax(arr));
        System.out.println("Ο μέγιστος αριθμός του πίνακα είναι το: " + findMaxAlt(arr));

    }

    public static int findMax(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new RuntimeException("Array is null");
        }

        int maxPosition = 0;
        int max = arr[maxPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                maxPosition = i;
                max = arr[maxPosition];
            }
        }
        return max;
    }

    public static int findMaxAlt(int[] arr) {

        int max = 0;

        max = Arrays.stream(arr).max().orElseThrow(() -> new RuntimeException("The Array is Null"));

        return max;
    }
}

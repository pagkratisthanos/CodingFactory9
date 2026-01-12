package gr.aueb.cf.cf9.review_challenges;

import java.util.Arrays;
import java.util.Map;

/**
 * Δίνονται 5 θετικοί ακέραιοι. Υπολογίστε:
 *
 * Το ελάχιστο άθροισμα 4 από τους 5 αριθμούς (δηλαδή, αθροίζουμε τους 4 μικρότερους).
 * Το μέγιστο άθροισμα 4 από τους 5 αριθμούς (δηλαδή, αθροίζουμε τους 4 μεγαλύτερους).
 *
 * Παράδειγμα:
 * Είσοδος: [1, 3, 5, 7, 9]
 *
 * Ελάχιστο άθροισμα: 1 + 3 + 5 + 7 = 16
 * Μέγιστο άθροισμα: 3 + 5 + 7 + 9 = 24
 * Τυπώνεται: 16 24
 *
 * Hint. Exclude one (regardless of duplicates).
 */

public class MinMaxSum {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        System.out.println(minSum(arr) + " " + maxSum(arr));
        // Output: 16 24
    }

    public static int minSum(int[] arr) {
        int totalSum = Arrays.stream(arr).sum();
        int max = Arrays.stream(arr).max().orElseThrow();

        return totalSum - max;
        // Αθροίζω όλα, αφαιρώ το μέγιστο → Μένουν οι 4 μικρότεροι!
    }

    public static int maxSum(int[] arr) {
        int totalSum = Arrays.stream(arr).sum();
        int min = Arrays.stream(arr).min().orElseThrow();

        return totalSum - min;
        // Αθροίζω όλα, αφαιρώ το ελάχιστο → Μένουν οι 4 μεγαλύτεροι!
    }
}

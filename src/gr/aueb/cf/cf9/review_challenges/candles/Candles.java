package gr.aueb.cf.cf9.review_challenges.candles;

import java.util.Arrays;

/**
 * Δίνεται ένας πίνακας με τα ύψη κεριών (π.χ., [3, 2, 3, 1]).
 * Μετρήστε πόσα κεριά έχουν το μέγιστο ύψος.
 *
 * Παράδειγμα:
 *
 * Είσοδος: [4, 4, 1, 3]
 * Έξοδος: 2 (το μέγιστο ύψος είναι 4 και υπάρχουν 2 κεριά με αυτό το ύψος).
 */
public class Candles {

    public static void main(String[] args) {

        int[] arr = {4, 4, 1, 3};

        System.out.printf("Το μέγιστο ύψος των κεριών είναι το %d και υπάρχουν %d κεριά με αυτό το ύψος."
                , findMaxEl(arr), candlesMaxCount(arr));


    }

    public static int findMaxEl(int[] arr) {

        int maxEl = Arrays.stream(arr).max().orElse(0);

        return maxEl;
    }

    public static long candlesMaxCount(int[] arr){

        long maxCount = Arrays.stream(arr).filter(el -> el == findMaxEl(arr)).count();

        return maxCount;

    }

}

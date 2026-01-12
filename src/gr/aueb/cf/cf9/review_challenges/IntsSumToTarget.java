package gr.aueb.cf.cf9.review_challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntsSumToTarget {

    /**
     * Δοθέντος ενός ταξινομημένου πίνακα ακεραίων, να επιστρέψετε τους δείκτες των
     * δύο αριθμών που αθροίζονται ώστε να δώσουν έναν συγκεκριμένο στόχο (target).
     *
     * Χρησιμοποιούμε Map ως μνήμη του τι έχει διαβαστεί και για κάθε ακέραιο που
     * διαβάζουμε ψάχνουμε στο map αν αθροίζεται στο target.
     */

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 7, 10, 13, 20};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum (int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            map.put(arr[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }


}

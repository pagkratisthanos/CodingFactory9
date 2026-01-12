package gr.aueb.cf.cf9.review_challenges.compare_triplets;

import java.sql.Array;
import java.util.Arrays;

public class CompareTriplets {

    /**
     * Δίνονται δύο πίνακες -ένας για την Alice και ένας για τον Bob -με 3 βαθμολογίες κάθε ένας.
     * Συγκρίνετε τις βαθμολογίες και επιστρέψτε τους πόντους κάθε παίκτη.
     * Οι Alice και Bob αξιολογούνται σε 3 κατηγορίες (π.χ., Μουσική, Προγραμματισμός, Γρήγορη Σκέψη).
     * Κάθε κατηγορία δίνει βαθμολογία από 1 έως 100.
     *
     * Αν η Alice έχει μεγαλύτερη βαθμολογία σε μια κατηγορία, παίρνει 1 πόντο.
     * Αν ο Bob έχει μεγαλύτερη βαθμολογία, παίρνει εκείνος 1 πόντο.
     * Αν είναι ίσοι, κανείς δεν παίρνει πόντο.
     *
     * Επιστροφή: Πίνακας με 2 θέσεις [πόντοι_Alice, πόντοι_Bob]
     */

    public static void main(String[] args) {

        int[] bob = {80, 90, 100};
        int[] alice = {60, 100, 100};

        int[] pointsArr = comparePoints(bob, alice);

        System.out.printf("Ο πίνακας βαθμολογιών για τον Bob και την Alice είναι ο:" +
                        " %s όπου %d είναι η βαθμολογία του Bob και %d η βαθμολογία της Alice"
                , Arrays.toString(pointsArr), pointsArr[0], pointsArr[1]);

    }

    public static int[] comparePoints(int[] arr1, int[] arr2) {

        int[] points = new int[2];
        int point1 = 0;
        int point2 = 0;
        

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[i]) {
                point1++;
                points[0] = point1;
            } else if (arr1[i] < arr2[i]) {
                point2++;
                points[1] = point2;
            }
        }

        return points;
    }
}



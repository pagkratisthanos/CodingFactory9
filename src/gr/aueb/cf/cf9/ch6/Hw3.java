package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

/**
 * Ζητήστε από τον χρήστη να εισάγει έξι ακεραίους από 1 έως 49
 * και ελέγξτε αν αυτή η εξάδα περνάει από τα παρακάτω φίλτρα (predicates)
 * 1. Δεν έχει πάνω από 3 άρτιους
 * 2. Δεν έχει πάνω από 3 περιττούς
 * 3. Δεν έχει πάνω από 3 συνεχόμενους
 * 4. Δεν έχει πάνω από 3 αριθμούς με τον ίδιο λήγοντα
 * 5. Δεν έχει πάνω από 3 αριθμούς στην ίδια δεκάδα
 */
public class Hw3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];

        System.out.println("Παρακαλώ εισάγετε 6 ακέραιους αριθμούς από το 1 έως το 49.");

    }

    /**
     * 1. Ελέγχει αν έχει πάνω από 3 άρτιους
     * @param arr Ο πίνακας ακεραίων που εισάγει ο χρήστης
     * @return true ή false
     */
    public static boolean hasNotMoreThan3Even (int[] arr) {
        int count = 0; // πλήθος άρτιων

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                count++;
        }

        if (count <= 3)
            return true;
        else
            return false;
    }

    public static boolean hasNotMoreThan3Odd (int[] arr) {
        int count = 0; // πλήθος περιττών

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                count++;
        }

        if (count <= 3)
            return true;
        else
            return false;
    }

    public static boolean hasNotMoreThan3Cont (int[] arr) {
        int count = 0; // πλήθος συνεχόμενων

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j] + 1)
                    count++;
            }
        }
        if (count <= 3)
            return true;
        else
            return false;
    }

    /**
     * 4. Αν έχει πάνω από 3 αριθμούς με τον ίδιο λήγοντα
     * @param arr Ο πίνακας ακεραίων που εισάγει ο χρήστης
     * @return true ή false
     */
    public static boolean hasMoreThan3SameEnding (int arr[]) {
        int[] endingArr = new int[10];
        int endingNum = 0;

        for (int i = 0; i < arr.length; i++) {
            endingNum = arr[i] % 10;
            endingArr[endingNum]++;
        }

        for (int i = 0; i < endingArr.length; i++) {
            if (endingArr[i] > 3) {
                return false;
            }
        }

        return true;
    }

    /**
     * 5. Αν έχει πάνω από 3 αριθμούς στην ίδια δεκάδα
     * @param arr Ο πίνακας ακεραίων που εισάγει ο χρήστης
     * @return true ή false
     */
    public static boolean hasSameDecade (int[] arr) {
        int[] decArr = new int[5];
        int decNum = 0;

        for (int i = 0; i < arr.length; i++) {
            decNum = arr[i] / 10;
            decArr[decNum]++;
        }

        for (int i : decArr) {
            if (i > 3)
                return false;
        }

        return true;
    }


}

package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;
/**
 * Επιστρέφει τη θέση στον πίνακα arr του μέγιστου στοιχείου του πίνακα
 */
public class HwGetMaxPosition {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = getMaxPosition(arr, 0, args.length -1);

        max = getMaxPosition(arr, 0,arr.length -1);

        System.out.printf("Η θέση του μέγιστου αριθμού είναι η: %d και ο αριθμός είναι ο %d", max, arr[max]);


    }

    /**
     * Βρίσκει τη θέση του μέγιστου αριθμού του πίνακα
     *
     * @param arr ο πίνακας ακεραίων
     * @param low ο ελάχιστος αριθμός
     * @param high ο μέγιστος αριθμός
     * @return την θέση του μέγιστου αριθμού
     */
    public static int getMaxPosition (int[] arr, int low, int high) {
        int maxPosition = low;

        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > arr[maxPosition])
                maxPosition = i;
        }
        return maxPosition;
    }
}

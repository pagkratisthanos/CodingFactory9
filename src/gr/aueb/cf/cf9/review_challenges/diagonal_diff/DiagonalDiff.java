package gr.aueb.cf.cf9.review_challenges.diagonal_diff;

/**
 * Δίνεται ένας τετραγωνικός πίνακας.
 * Να υπολογιστεί η απόλυτη διαφορά μεταξύ των αθροισμάτων των διαγωνίων του.
 * Παράδειγμα:

 *     {1, 2, 3},
 *     {4, 5, 6},
 *     {9, 8, 9}
 *
 * Κύρια Διαγώνιος (1, 5, 9):
 * 1 + 5 + 9 = 15
 *
 * Δευτερεύουσα Διαγώνιος (3, 5, 9):
 * 3 + 5 + 9 = 17
 *
 * Διαφορά:
 * |15 - 17| = 2
 */

public class DiagonalDiff {

    public static void main(String[] args) {

        int[][] squareArr = { {1, 2, 3},
                {4, 5, 6},
                {9, 8, 9}
        };

        System.out.println("Η απόλυτη διαφορά μεταξύ των αθροισμάτων των " +
                "διαγωνίων του τετραγωνικού πίνακα είναι: " + diagonalDiff(squareArr));

    }

    public static int diagonalDiff(int[][] arr) {

        int diagonalA = 0;
        int diagonalB = 0;
        int diff = 0;

        for (int i = 0; i < arr.length; i++) {
            diagonalA += arr[i][i];
            diagonalB += arr[i][arr.length -1 - i];
        }

        diff = diagonalA - diagonalB;

        return Math.abs(diff);
    }
}

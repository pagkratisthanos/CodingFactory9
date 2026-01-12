package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

public class Hw2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int[] arr = {1, 4, 2, 3, 7, 5, 8, 6, 10, 9, 13, 12, 11};

        System.out.println("Παρακαλώ εισάγετε έναν ακέρο αριθμό από τον πίνακα arr.");
        num = scanner.nextInt();
        System.out.printf("Ο αριθμός %d βρίσκεται στη θέση %d. \n", num, findPosition(arr, num));
        System.out.println();

        System.out.println("Οι άρτιοι αριθμοί του πίνακα arr είναι οι:\n");
        printEven(arr);
        System.out.println();

        int[] doubleArr = doubleArray(arr);

        System.out.println("Ο πίνακας με τις διπλάσιες τιμές του πίνακα arr είναι:\n");
        for (int el:  doubleArr) {
                System.out.print(el + " ");
        }
        System.out.println();

        if (isAllPositiveCheck(arr)) {
            System.out.println("Όλα τα στοιχεία του πίνακα είναι θετικοί αριθμοί");
        } else System.out.println("Δεν είναι όλα τα στοιχεία του πίνακα θετικοί αριθμοί");




    }

    /**
     * 1. Αναζήτηση ενός στοιχείου στον πίνακα.
     * (Επιστρέφει την θέση του στοιχείου)
     *
     * @param arr Ο πίνακας ακεραίων που εισάγει ο χρήστης.
     * @param element Ο ακέραιος του οποίου ψάχνουμε τη θέση.
     * @return Επιστρέφει τη θέση του ζητούμενου ακεραίου.
     */
    public static int findPosition(int[] arr, int element) {
        if (arr == null || arr.length == 0) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    /**
     *  2. Φιλτράρισμα των ζυγών (επιστρέφει void, μόνο εκτύπωση των ζυγών)
     *
     * @param arr Ο πίνακας ακεραίων που εισάγει ο χρήστης
     */
    public static void printEven(int[] arr) {

        if (arr == null || arr.length == 0) {
            System.out.println("Ο πίνακας είναι null");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");
        }
    }

    /**
     * Mapping κάθε στοιχείου του πίνακα με το διπλάσιο
     * @param arr Ο πίνακας ακεραίων που εισάγει ο χρήστης
     * @return Επιστρέφει νέο πίνακα με διπλάσιες τιμές
     */
    public static int[] doubleArray(int[] arr) {

        if (arr == null || arr.length == 0) {
            System.out.println("Ο πίνακας είναι μηδενικός");
            return null;
        }

        int[] doubleArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            doubleArr[i] = 2 * arr[i];
        }
        return doubleArr;
    }

    /**
     * 4.  Έλεγχος αν υπάρχει έστω ένας θετικός αριθμός
     * @param arr Ο πίνακας ακεραίων που εισάγει ο χρήστης
     * @return επιστέφει true ή false
     */
    public static boolean isOnePositiveCheck(int[] arr) {

        if (arr == null || arr.length == 0) return false;

        for (int num : arr) {
            if (num > 0)
                return true;
        }
        return false;

    }

    /**
     * 5. Έλεγχος αν όλα τα στοιχεία του πίνακα είναι θετικοί
     * @param arr Ο πίνακας ακεραίων που εισάγει ο χρήστης
     * @return επιστέφει true ή false
     */
    public static boolean isAllPositiveCheck(int[] arr) {
        if (arr == null || arr.length == 0) return false;

        for (int num : arr) {
            if (num <= 0)
                return false;
        }
        return true;
    }
}

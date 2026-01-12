package gr.aueb.cf.cf9.review_challenges.frequencies;

/**
 * Υπολογίζει τις αναλογίες θετικών, αρνητικών και μηδενικών
 * στοιχείων ενός πίνακα ακεραίων.
 *
 * @author Thanos
 * @version 1.0
 */
public class Frequencies {

    public static void main(String[] args) {
        // Παράδειγμα πίνακα για δοκιμή
        int[] arr = {1, -2, 0, 3, 0, -4};

        // Υπολογισμός συχνοτήτων
        double negative = negativeFrequencies(arr);
        double positive = positiveFrequencies(arr);
        double zero = zeroFrequencies(arr);

        // Εμφάνιση αποτελεσμάτων με 6 δεκαδικά ψηφία
        System.out.printf("%.6f  // Θετικά%n", positive);
        System.out.printf("%.6f  // Αρνητικά%n", negative);
        System.out.printf("%.6f  // Μηδενικά%n", zero);
    }

    /**
     * Υπολογίζει την αναλογία των μηδενικών στοιχείων στον πίνακα.
     *
     * @param arr ο πίνακας ακεραίων προς ανάλυση
     * @return η αναλογία των μηδενικών (0.0 έως 1.0)
     * @throws RuntimeException αν ο πίνακας είναι null ή άδειος
     */
    public static double zeroFrequencies(int[] arr) {
        // Έλεγχος εγκυρότητας πίνακα
        if (arr == null || arr.length == 0) {
            throw new RuntimeException("The array is null or empty");
        }

        int zeroCount = 0;

        // Μέτρηση μηδενικών στοιχείων
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
        }

        // Υπολογισμός αναλογίας
        return (double) zeroCount / arr.length;
    }

    /**
     * Υπολογίζει την αναλογία των αρνητικών στοιχείων στον πίνακα.
     *
     * @param arr ο πίνακας ακεραίων προς ανάλυση
     * @return η αναλογία των αρνητικών (0.0 έως 1.0)
     * @throws RuntimeException αν ο πίνακας είναι null ή άδειος
     */
    public static double negativeFrequencies(int[] arr) {
        // Έλεγχος εγκυρότητας πίνακα
        if (arr == null || arr.length == 0) {
            throw new RuntimeException("The array is null or empty");
        }

        int negativeCount = 0;

        // Μέτρηση αρνητικών στοιχείων
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negativeCount++;
            }
        }

        // Υπολογισμός αναλογίας
        return (double) negativeCount / arr.length;
    }

    /**
     * Υπολογίζει την αναλογία των θετικών στοιχείων στον πίνακα.
     *
     * @param arr ο πίνακας ακεραίων προς ανάλυση
     * @return η αναλογία των θετικών (0.0 έως 1.0)
     * @throws RuntimeException αν ο πίνακας είναι null ή άδειος
     */
    public static double positiveFrequencies(int[] arr) {
        // Έλεγχος εγκυρότητας πίνακα
        if (arr == null || arr.length == 0) {
            throw new RuntimeException("The array is null or empty");
        }

        int positiveCount = 0;

        // Μέτρηση θετικών στοιχείων
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            }
        }

        // Υπολογισμός αναλογίας
        return (double) positiveCount / arr.length;
    }
}
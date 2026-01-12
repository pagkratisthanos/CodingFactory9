package gr.aueb.cf.cf9.ch4;

/**
 * Βρίσκει το άθροισμα των ακεραίων από 1 έως 50
 */
public class HomeworkSumIntApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        int sum = 0;

        // Υπολογισμός του αθροίσματος των ακεραίων από 1 έως 50
        for (int i = 1; i <= 50; i++) {
            sum += i;
        }

        // Έξοδος αποτελέσματος
        System.out.println(sum);
    }
}

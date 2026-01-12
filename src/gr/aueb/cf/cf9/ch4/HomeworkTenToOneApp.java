package gr.aueb.cf.cf9.ch4;

/**
 * Εκτυπώνει από το 1 έως το 10 με αντίστροφη σειρά, δηλ. 10 9 8 … 3 2 1
 */
public class HomeworkTenToOneApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        int num = 0;

        System.out.print("Οι ακέραιοι αριθμοί από το από το 10 είναι οι έως το 1 είναι οι: ");

        // Επεξεργασία και έξοδος δεδομένων
        for (int i = 10; i > 0; i--) {
            num = i;
            System.out.print(num + " ");
        }
    }
}

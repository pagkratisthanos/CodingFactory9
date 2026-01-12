package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Εμφανίστε επαναληπτικά ένα μενού με τις παρακάτω επιλογές,
 * το οποίο να επαναλαμβάνεται μέχρι ο χρήστης να δώσει τον αριθμό 5.
 * Για κάθε επιλογή από 1 – 4 θα πρέπει να εμφανίζεται feedback,
 * για παράδειγμα αν ο χρήστης δώσει 1, θα εμφανίζεται το μήνυμα  “Επιλέξατε Εισαγωγή».
 * Θα πρέπει επίσης να ελέγχετε αν ο χρήστης δώσει αριθμό < 1 ή > 5
 * και να δίνετε κατάλληλο μήνυμα.
 */
public class HomeworkMenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Δήλωση μεταβλητών
        int num = 0;

        System.out.println("Παρακαλώ πληκτρολογήστε μία από τις παρακάτω επιλογές: ");

        // Εισαγωγή δεδομένων από τον χρήστη
        do {
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            num = scanner.nextInt();

            if (num < 1 || num > 5) {
                System.out.println("Παρακαλώ επιλέξτε έναν αριθμό μεταξύ 1 και 5");
            } else if (num == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if (num == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (num == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (num == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            } else if (num == 5) {
                System.out.println("Επιλέξατε Έξοδο. Καλή συνέχεια!");
            }
        } while (num != 5);
    }
}

package gr.aueb.cf.cf9.ch3;


import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ένα ακέραιο που συμβολίζει μία
 * θερμοκρασία. Και το πρόγραμμα υπολογίζει αν η
 * θερμοκρασία είναι < 0 τότε μία μεταβλητή γίνεται true,
 * αλλιώς γίνεται false
 */
public class TemperatureApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempeBelowZero = false;

        // Εισαγωγή Δεδομένων
        System.out.println("Παρακαλώ εισάγετε μία θερμοκρασία");
        temperature = scanner.nextInt();

        // Επεξεργασία δεδομένων
        isTempeBelowZero = temperature < 0;

        // Εκτύπωση αποτελεσμάτων
        System.out.println("Η θερμοκρασία είναι μικρότερη από 0: " + isTempeBelowZero);
    }
}

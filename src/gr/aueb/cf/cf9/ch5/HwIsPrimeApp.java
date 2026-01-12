package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;
/**
 * δέχεται έναν ακέραιο αριθμό και να επιστρέφει true
 * αν ο αριθμός είναι πρώτος και false αν δεν είναι
 */
public class HwIsPrimeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Δήλωση και αρχικοποίηση μεταβλητών.
        int num = 0;

        // Εισαγωγή δεδομένων από τον χρήστη.
        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο αριθμό.");
        num = scanner.nextInt();

        // Έλεγχος συνθήκης με την μέθοδο και εξαγωγή απότελέσματος
       if (isPrime(num) == false) {
           System.out.println("Ο αριθμός δεν πρώτος");
       } else {
           System.out.println("Ο αριθμός είναι πρώτος");
       }

    }

    /**
     * Ελέγχει εάν ένας ακέραιος αριθμός είναι πρώτος.
     * @param num ο ακέραιος αριθμός
     * @return true or false
     */
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

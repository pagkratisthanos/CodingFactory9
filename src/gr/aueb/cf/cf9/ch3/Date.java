package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Γράψτε ένα πρόγραμμα που διαβάζει από τον χρήστη
 * 3 ακέραιους αριθμούς που αναπαριστούν ημέρα, μήνα,
 * έτος και την εμφανίζει σε μορφή: ΗΗ/ΜΜ/ΕΕ
 */
public class Date {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Δήλωση μεταβλητών
        int day = 0;
        int month = 0;
        int year = 0;

        // Είσοδος δεδομένων
        System.out.println("Please enter day");
        day = scanner.nextInt();
        System.out.println("Please enter month");
        month = scanner.nextInt();
        System.out.println("Please enter year");
        year = scanner.nextInt();

        // Έξοδος αποτελέσματος
        System.out.printf("%02d/%02d/%04d", day, month, year);
    }
}

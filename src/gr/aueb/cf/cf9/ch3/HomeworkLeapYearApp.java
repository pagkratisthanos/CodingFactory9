package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει αν ένα έτος είναι δίσεκτο ή όχι.
 * Ένα έτος είναι δίσεκτο αν (διαιρείται ακριβώς
 * με το 4 και όχι με το 100) ή
 * αν (διαιρείται ακριβώς με το 400)
 */
public class HomeworkLeapYearApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year = 0;
        int mod1 = 0;
        int mod2 = 0;
        int mod3 = 0;

        // Είσοδος δεδομένων από τον χρήστη
        System.out.println("Παρακαλώ εισάγετε το έτος: ");
        year = scanner.nextInt();

        // Επεξεργασία δεδομένων και έξοδος αποτελεσμάτων
        if (year > 0) {
            mod1 = year % 4;
            mod2 = year % 100;
            mod3 = year % 400;

            if ((mod1 == 0) && (mod2 != 0)) {              // ✅ Ένθετο if
                System.out.printf("Το έτος %d είναι δίσεκτο.%n", year);
            } else if (mod3 == 0) {                        // ✅ else if του ένθετου
                System.out.printf("Το έτος %d είναι δίσεκτο.%n", year);
            } else {                                       // ✅ else του ένθετου
                System.out.printf("Το έτος %d δεν είναι δίσεκτο.%n", year);
            }
        } else {                                           // ✅ else του εξωτερικού if
            System.out.println("Το έτος που πληκτρολογήσατε δεν υπάρχει");
        }
    }
}
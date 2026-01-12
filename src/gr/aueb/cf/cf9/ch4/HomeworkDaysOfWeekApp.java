package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * Δέχεται έναν ακέραιο (1-7) και επιστρέφει
 * το αντίστοιχο όνομα της ημέρας της εβδομάδας
 * (π.χ., 1 → "Δευτέρα").
 */
public class HomeworkDaysOfWeekApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

    while (true) {
        System.out.println("Παρακαλώ πληκτρολογήστε έναν αριθμό από το 1 έως το 7.");
        num = scanner.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Δευτέρα");
                    break;
                case 2:
                    System.out.println("Τρίτη");
                    break;
                case 3:
                    System.out.println("Τετάρτη");
                    break;
                case 4:
                    System.out.println("Πέμπτη");
                    break;
                case 5:
                    System.out.println("Παρασκευή");
                    break;
                case 6:
                    System.out.println("Σάββατο");
                    break;
                case 7:
                    System.out.println("Κυριακή");
                    break;
                default:
                    System.out.println("Πληκτρολογήσατε λάθος αριθμό");
                    continue;
            } break;
    }

    }
}

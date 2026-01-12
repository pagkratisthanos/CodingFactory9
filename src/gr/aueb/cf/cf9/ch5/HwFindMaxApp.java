package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Γράψτε μια μέθοδο με όνομα findMax που να δέχεται
 * τρεις ακέραιους αριθμούς και να επιστρέφει
 * τον μεγαλύτερο από αυτούς
 */
public class HwFindMaxApp {

    public static int findMax (int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Παρακαλώ εισάγετε 3 ακέραιους αριθμούς.");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        System.out.printf("Ο Αριθμός %d είναι ο μεγαλύτερος.", findMax(num1, num2, num3));

    }
}

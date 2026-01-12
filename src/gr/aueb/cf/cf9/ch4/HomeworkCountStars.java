package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * Αναπτύξτε πέντε προγράμματα όπου ο χρήστης
 * θα δίνει το πλήθος των stars, έστω n
 * 1.1 n οριζόντια αστεράκια,
 * 1.2 n κάθετα,
 * 1.3 nxn,
 * 1.4 από 1 έως n,
 * 1.5 από n έως 1
 */
public class HomeworkCountStars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Δήλωση και αρχικοποίηση μεταβλητών
        char star = '*';
        int n = 0;
        int prod = 1;

        // 1.1 Είσοδος δεδομένων από το χρήστη
        System.out.println("Παρακαλώ εισάγετε το πλήθος των οριζόντιων αστεριών(ακέραιος αριθμός)");
        n = scanner.nextInt();

        // 1.1 Υπολογίζει n οριζόντια αστεράκια
        for (int i = 1; i <= n; i++) {
            System.out.print(star);
        }
        // 1.2 Είσοδος δεδομένων από το χρήστη
        System.out.println("\nΠαρακαλώ εισάγετε το πλήθος των κάθετων αστεριών(ακέραιος αριθμός)");
        n = scanner.nextInt();

        // 1.2 Υπολογίζει n κάθετα αστεράκια
        for (int i = 1; i <= n; i++) {
            System.out.println(star);
        }

        // 1.3 Είσοδος δεδομένων από το χρήστη
        System.out.println("\nΠαρακαλώ εισάγετε το πλήθος αστεριών(ακέραιος αριθμός)");
        n = scanner.nextInt();
        prod = n * n;

        //1.3 Υπολογίζει nxn αστεράκια
        for (int i = 1; i <= prod; i++) {
            System.out.print(star);
        }

        // 1.4 Είσοδος δεδομένων από το χρήστη
        System.out.println("\nΠαρακαλώ εισάγετε το πλήθος των αστεριών(ακέραιος αριθμός");
        n = scanner.nextInt();

        // 1.4 Υπολογισμός από 1 έως n
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(star);
            }
            System.out.println();
        }

        // 1.5 Είσοδος δεδομένων από το χρήστη
        System.out.println("\nΠαρακαλώ εισάγετε το πλήθος των αστεριών(ακέραιος αριθμός");
        n = scanner.nextInt();

        // 1.5 Υπολογισμός από n έως 1
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(star);
            }
            System.out.println();
        }





    }
}

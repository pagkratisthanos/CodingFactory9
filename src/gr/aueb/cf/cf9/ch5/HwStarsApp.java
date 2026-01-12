package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού με 6 επιλογές:
 * 1. Εμφάνισε n αστεράκια οριζόντια
 * 2. Εμφάνισε n αστεράκια κάθετα
 * 3. Εμφάνισε n γραμμές με n αστεράκια
 * 4. Εμφάνισε n γραμμές με αστεράκια 1 έως n
 * 5. Εμφάνισε n γραμμές με αστεράκια n έως 1
 * 6. Έξοδος από το πρόγραμμα
 */
public class HwStarsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Δήλωση και αρχικοποίηση μεταβλητών
        int choice = 0;
        int countStars = 0;

        // Είσοδος δεδομένων από το χρήστη, επεξεργασία και έξοδος
        while (true) {
            System.out.println("Παρακαλώ επιλέξτε έναν αριθμό από 1 έως 6: ");
            printMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Παρακαλώ πληκτρολογήστε το πλήθος των αστεριών");
                    countStars = scanner.nextInt();
                    horizontalStars(countStars);
                    System.out.println();
                    continue;
                case 2:
                    System.out.println("Παρακαλώ πληκτρολογήστε το πλήθος των αστεριών");
                    countStars = scanner.nextInt();
                    verticalStars(countStars);
                    System.out.println();
                    continue;
                case 3:
                    System.out.println("Παρακαλώ πληκτρολογήστε το πλήθος των αστεριών");
                    countStars = scanner.nextInt();
                    nToNstars(countStars);
                    System.out.println();
                    continue;
                case 4:
                    System.out.println("Παρακαλώ πληκτρολογήστε το πλήθος των αστεριών");
                    countStars = scanner.nextInt();
                    oneToNstars(countStars);
                    System.out.println();
                    continue;
                case 5:
                    System.out.println("Παρακαλώ πληκτρολογήστε το πλήθος των αστεριών");
                    countStars = scanner.nextInt();
                    nToOnestars(countStars);
                    System.out.println();
                    continue;
                case 6:
                    exit();
                    return;
                default:
                    System.out.println("Δώσατε μη έγκυρη επιλογή");
                    continue;
            }
        }

    }

    // Δημιουργία μεθόδου για την εκτύπωση του menu
    public static void printMenu() {
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 έως n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n έως 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    // Δημιουργία μεθόδου για την εκτύπωση n αστεριών οριζόντια
    public static void horizontalStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

    // Δημιουργία μεθόδου για την εκτύπωση n αστεριών κάθετα
    public static void verticalStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    // Δημιουργία μεθόδου για την εκτύπωση n αστεριών σε n γραμμές
    public static void nToNstars(int n) {
        for (int i= 1; i <= n; i++) {
            horizontalStars(n);
            System.out.println();
        }

    }

    // Δημιουργία μεθόδου για την εκτύπωση από 1 έως n αστεριών σε n γραμμές
    public static void oneToNstars(int n) {
        for (int i = 1; i <= n; i++) {
           horizontalStars(i);
           System.out.println();
        }
    }

    // Δημιουργία μεθόδου για την εκτύπωση από n έως 1 αστεριών σε n γραμμές
    public static void  nToOnestars(int n) {
        for (int i = n; i >= 1; i--) {
            horizontalStars(i);
            System.out.println();
        }
    }

    // Δημιουργία μεθόδου που θα ενημερώνει το χρήστη για την έξοδο από το πρόγραμμα
    public static void exit() {
            System.out.println("Επιλέξατε έξοδο από το πρόγραμμα. Καλή συνέχεια!");
    }

}

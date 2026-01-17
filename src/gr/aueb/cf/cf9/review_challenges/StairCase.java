package gr.aueb.cf.cf9.review_challenges;

import java.util.Scanner;

/**
 * Δημιουργήστε μια σκάλα με # και κενά ( ), όπου:
 * Το ύψος της σκάλας είναι ένας ακέραιος n.
 *
 * Κάθε σκαλί έχει τον ίδιο αριθμό # με τον αριθμό της γραμμής του (πρώτη γραμμή: 1 #, δεύτερη γραμμή: 2 #, κ.ο.κ.).
 * Τα κενά ευθυγραμμίζονται στα δεξιά για να σχηματίσουν τη σκάλα.
 *
 * Παράδειγμα για n = 4:
 *
 * text
 *    #
 *   ##
 *  ###
 * ####
 */

public class StairCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stairHeight = 0;

        System.out.println("Please insert the chair height");

        stairHeight = scanner.nextInt();

        System.out.println("The stair you chose is: ");

        stairBuilder(stairHeight);

    }

    public static void stairBuilder (int height) {
        if (height <= 0) {
            return;
        }

        for (int i = 1; i <= height; i++) {
            String spaces = " ".repeat(height - i);
            String hashes = "*".repeat(i);
            System.out.println(spaces + hashes);
        }
    }
}

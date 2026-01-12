package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Δέχεται έναν ακέραιο αριθμό ως παράμετρο και να επιστρέφει το τετράγωνό του
 */
public class HwSquareApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = 0;
        int expected = 25;

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο αριθμό: ");
        integer = scanner.nextInt();

        System.out.printf("Το τετράγωνο του %d είναι το %d.\n", integer, squareCalc(integer));

        if (Math.abs(squareCalc(integer)) - expected == 0) {
            System.out.println("Το αποτέλεσμα είναι αληθές");
        } else System.out.println("Το αποτέλεσμα είναι λάθος");


    }

    /**
     * Υπολογίζει το τετράγωνο ενός εκέραιου
     * @param integer
     * @return
     */
    public static int squareCalc(int integer) {
        int square = 0;
        square = integer * integer;
        return square;
    }
}

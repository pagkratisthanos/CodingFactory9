package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Calculates the wight in kilogramms, and the program calculates
 * the wight in gramms.
 */
public class KiloToGramms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weightInKilograms = 0;
        int wightInGrams = 0;
        final int KILOGRAMS_TO_GRAMS = 1000;

        System.out.println("Παρακαλώ εισάγετε το βάρος σας σε κιλά");
        weightInKilograms = scanner.nextInt();
        wightInGrams = weightInKilograms * KILOGRAMS_TO_GRAMS;

        System.out.printf("Το βάρος σε γραμμάρια των %d κιλών είναι: %,d γραμμάρια", weightInKilograms, wightInGrams);
    }

}

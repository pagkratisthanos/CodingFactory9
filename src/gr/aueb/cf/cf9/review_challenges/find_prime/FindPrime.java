package gr.aueb.cf.cf9.review_challenges.find_prime;

import java.util.Scanner;

/**
 * Γράψτε μια μέθοδο που ελέγχει αν ένας αριθμός είναι πρώτος
 * (δηλαδή διαιρείται μόνο με το 1 και τον εαυτό του).
 */

public class FindPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο αριθμό");

        number = scanner.nextInt();

        if (isPrime(number) == false) {
            System.out.println("O αριθμός " + number + " δεν είναι πρώτος");
        }
        else System.out.println("O αριθμός " + number + " είναι πρώτος");


    }

    public static boolean isPrime(int number) {

        if (number <= 0) {
            throw new RuntimeException("The number can not be <= 0");
        }

        if (number == 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

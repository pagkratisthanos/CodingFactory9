package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει όλους τους ζυγούς αριθμούς από 1 έως 20
 */
public class HomeworkEvenNumberApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Δήλωση και αρχικοποίηση μεταβλητών
        int num = 20;
        int div = 0;

        for (int i = 1; i <= 20; i++) {
            num = i;
            div = num % 2;
            if (div == 0) {
                System.out.print(num + " ");
            }
        }

    }
}

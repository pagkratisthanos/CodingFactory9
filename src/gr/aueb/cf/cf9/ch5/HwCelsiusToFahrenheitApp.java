package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;
/**
 * δέχεται μια θερμοκρασία σε βαθμούς Κελσίου (double)
 * και να την μετατρέπει σε Φαρενάιτ (double)
 * χρησιμοποιώντας τον τύπο: Κελσίου * 9/5 + 32
 */
public class HwCelsiusToFahrenheitApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tempC = 0.0;
        double expected = 111.2;


        System.out.println("Παρακαλώ εισάγετε την θερμοκρασία σε βαθμούς Κελσίου");

        // Είσοδος δεδομένων από το χρήστη και εμφάνιση αποτελέσματος
        tempC = scanner.nextDouble();
        System.out.printf("Οι %f βαθμοί Κελσίου είναι ίσοι με %f βαθμούς Fahrenheit\n", tempC, celsiusToFahrenheit(tempC));

        // Έλεγχος ορθότητας με προκαθορισμήνη τιμή στην μεταβλητή expected
        if (Math.abs(celsiusToFahrenheit(tempC) - expected) < 0.01) {
            System.out.println("Το αποτέλεσμα είναι αληθές");
        }

    }

    /**
     * Μετατρέπει τους βαθμούς Κελσίου σε Fahrenheit
     * @param tempC     οι βαθμοί Κελσίου
     * @return
     */
    public static double celsiusToFahrenheit (double tempC) {
        double fahrenheit = 0.0;

        fahrenheit = (tempC * 9) / 5 + 32;
        return fahrenheit;
    }
}

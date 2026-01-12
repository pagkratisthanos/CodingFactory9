package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Θέλουμε να αναπτύξουμε ένα πρόγραμμα που να μετατρέπει ακέραιες
 * θερμοκρασίες (Fahrenheit) στην κλίμακα Κελσίου. Φαρενάιτ
 * Το πρόγραμμα θα εκτυπώνει κατάλληλο μήνυμα και θα διαβάζει στη συνέχεια
 * την ακέραια θερμοκρασία από τον χρήστη • Θα την μετατρέπει στην κλίμακα
 * Κελσίου σύμφωνα με τον τύπο (5/9)(F-32)
 */
public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Δήλωση μεταβλητών
        int fahrenheit = 0;
        int celsius = 0;

        // Είσοδος δεδομένων
        System.out.println("Please enter the temperature in degrees Fahrenheit");
        fahrenheit = scanner.nextInt();

        // Επεξεργασία δεδομένων
        celsius = 5 * (fahrenheit - 32) / 9;

        // Έξοδος αποτελέσματος
        System.out.printf("The temperature is %d degrees Celsius", celsius);
    }
}

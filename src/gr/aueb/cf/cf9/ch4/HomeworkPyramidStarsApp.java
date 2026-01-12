package gr.aueb.cf.cf9.ch4;

/**
 * Φτιάχνει μία πυραμίδα από * με 4 σειρές
 */
public class HomeworkPyramidStarsApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        int stars = 1;
        int space = 3;

        // Επεξεργασία δεδομένων και έξοδος αποτελέσματος
        for (int i = 1; i <= 4; i++) {
                String countSpace = " ".repeat(space);
                System.out.print(countSpace);
                String countStars = "*".repeat(stars);
                System.out.println(countStars);
                stars = stars + 2;
                space = space - 1;
                }
    }
}


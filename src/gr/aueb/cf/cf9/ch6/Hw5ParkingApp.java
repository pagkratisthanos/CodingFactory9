import java.util.Arrays;

public class Hw5ParkingApp {
    public static void main(String[] args) {
        // Αρχικός πίνακας με άφιξη και αναχώρηση
        int[][] arr = {{1012, 1136}, {1317, 1417}, {1015, 1020}};

        // Υπολογισμός μέγιστου αριθμού αυτοκινήτων
        int maxCars = findMaxCars(arr);

        System.out.println("Μέγιστος αριθμός αυτοκινήτων: " + maxCars);
    }

    public static int findMaxCars(int[][] arr) {
        // Βήμα 1: Δημιουργία πίνακα events
        // Κάθε αυτοκίνητο έχει 2 events (άφιξη + αναχώρηση)
        int[][] events = new int[arr.length * 2][2];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            // Άφιξη
            events[index][0] = arr[i][0];  // Ώρα άφιξης
            events[index][1] = 1;           // 1 = Άφιξη
            index++;

            // Αναχώρηση
            events[index][0] = arr[i][1];  // Ώρα αναχώρησης
            events[index][1] = 0;           // 0 = Αναχώρηση
            index++;
        }

        // Βήμα 2: Ταξινόμηση με βάση την ώρα
        Arrays.sort(events, (e1, e2) -> {
            if (e1[0] != e2[0]) {
                return e1[0] - e2[0];  // Σύγκριση ωρών
            }
            return e1[1] - e2[1];      // Αν ίδια ώρα, αναχώρηση πρώτα
        });

        // Βήμα 3: Υπολογισμός μέγιστου
        int currentCars = 0;
        int maxCars = 0;

        for (int i = 0; i < events.length; i++) {
            if (events[i][1] == 1) {
                currentCars++;  // Άφιξη
            } else {
                currentCars--;  // Αναχώρηση
            }

            if (currentCars > maxCars) {
                maxCars = currentCars;
            }
        }

        return maxCars;
    }
}
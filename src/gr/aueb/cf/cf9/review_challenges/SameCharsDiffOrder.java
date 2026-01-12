package gr.aueb.cf.cf9.review_challenges;

/**
 * Γράψτε μια μέθοδο που ελέγχει αν δύο Strings
 * είναι αναγραμματισμός το ένα του άλλου
 * (δηλαδή περιέχουν τους ίδιους χαρακτήρες σε διαφορετική σειρά).
 *
 * Παράδειγμα
 * 'listen', 'silent'
 */

public class SameCharsDiffOrder {

    public static void main(String[] args) {

        String str1 = "Thanos";
        String str2 = "Pagkratis";
        String str3 = "listen";
        String str4 = "silent";

        System.out.println(areAnagrams(str1, str2));
        System.out.println(areAnagrams(str3, str4));
    }

    public static boolean areAnagrams (String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] frequency = new int[128];

        for (char c : s1.toCharArray()) {
            frequency[c]++;
        }

        for (char c : s2.toCharArray()) {
            if (--frequency[c] < 0) {
                return false;
            }
        }
        return true;

    }
}

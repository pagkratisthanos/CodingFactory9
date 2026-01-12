package gr.aueb.cf.cf9.review_challenges;

/**
 * Γράψτε μια μέθοδο που ελέγχει αν ένα String είναι
 * παλίνδρομο (διαβάζεται το ίδιο από την αρχή και το τέλος).
 */

public class PalindromeString {

    public static void main(String[] args) {

        String string = "alla";

        System.out.println(isPalindrome(string));
    }

    public static boolean isPalindrome (String str) {

        StringBuilder stringBuilder = new StringBuilder(str);

        return stringBuilder.reverse().toString().equals(str);
    }


}

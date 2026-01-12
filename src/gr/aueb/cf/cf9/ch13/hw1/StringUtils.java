package gr.aueb.cf.cf9.ch13.hw1;


/**
 * Μία utility class με public static μεθόδους για string manipulation,
 * όπως να γίνεται reverse ένα string, να μετατρέπεται ένα string σε uppercase,
 * και να ελέγχεται εάν ένα string είναι παλινδρομικό
 */
public class StringUtils {

    private StringUtils() {

    }

    /**
     * Reverses a given string
     * @param str       the given string
     * @return          returns the given string
     */
    public static String stringReverse (String str) {
        if (str == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    /**
     * Turns all the given string's letters to upper case
     * @param str       the given string
     * @return          returns a new string with all the given string's letters to upper case
     */
    public static String stringToUppercase (String str) {
        if (str == null) {
            return null;
        }

        return str.toUpperCase();
    }

    /**
     * Is checking if a string is palindrome
     * @param str       the given string
     * @return          true or false
     */
    public static boolean isPalindrome (String str) {
        if (str == null) {
            return false;
        }

        return stringReverse(str).equals(str);
    }
}

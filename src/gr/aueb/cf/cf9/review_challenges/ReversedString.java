package gr.aueb.cf.cf9.review_challenges;

/**
 * Γράψτε μια μέθοδο που δέχεται ένα String
 * και επιστρέφει το αντεστραμμένο του.
 */

public class ReversedString {

    public static void main(String[] args) {

        String str = "Thanos Pagkratis";

        System.out.println(reversedString(str));

    }

    public static String reversedString (String s) {

        StringBuilder sb = new StringBuilder(s);

        return sb.reverse().toString();
    }
}

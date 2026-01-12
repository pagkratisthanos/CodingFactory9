/**
 * Πρόγραμμα Κρυπτογράφησης και Αποκρυπτογράφησης
 * Κάθε χαρακτήρα αντικαθίσταται με τον λεξικογραφικά επόμενο (κρυπτογράφηση)
 * ή προηγούμενο (αποκρυπτογράφηση)
 *
 * @author Student
 */
public class Hw1CryptoApp {

    /**
     * Κρυπτογραφεί ένα String αντικαθιστώντας κάθε χαρακτήρα
     * με τον λεξικογραφικά επόμενο
     *
     * @param plainText Το αρχικό κείμενο
     * @return Το κρυπτογραφημένο κείμενο
     */
    public static String encrypt(String plainText) {
        if (plainText == null || plainText.length() == 0) {
            return "";
        }

        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < plainText.length(); i++) {
            char currentChar = plainText.charAt(i);
            char encryptedChar = (char) (currentChar + 1);  // Επόμενος χαρακτήρας
            encrypted.append(encryptedChar);
        }

        return encrypted.toString();
    }

    /**
     * Αποκρυπτογραφεί ένα String αντικαθιστώντας κάθε χαρακτήρα
     * με τον λεξικογραφικά προηγούμενο
     *
     * @param encryptedText Το κρυπτογραφημένο κείμενο
     * @return Το αποκρυπτογραφημένο κείμενο
     */
    public static String decrypt(String encryptedText) {
        if (encryptedText == null || encryptedText.length() == 0) {
            return "";
        }

        StringBuilder decrypted = new StringBuilder();

        for (int i = 0; i < encryptedText.length(); i++) {
            char currentChar = encryptedText.charAt(i);
            char decryptedChar = (char) (currentChar - 1);  // Προηγούμενος χαρακτήρας
            decrypted.append(decryptedChar);
        }

        return decrypted.toString();
    }

    public static void main(String[] args) {
        System.out.println("=== ΠΡΟΓΡΑΜΜΑ ΚΡΥΠΤΟΓΡΑΦΗΣΗΣ ===\n");

        // Δοκιμή 1: Απλό κείμενο
        System.out.println("--- Δοκιμή 1: Απλό κείμενο ---");
        String text1 = "Hello";
        String encrypted1 = encrypt(text1);
        String decrypted1 = decrypt(encrypted1);

        System.out.println("Αρχικό κείμενο:        " + text1);
        System.out.println("Κρυπτογραφημένο:       " + encrypted1);
        System.out.println("Αποκρυπτογραφημένο:    " + decrypted1);
        System.out.println("Σωστό:                 " + text1.equals(decrypted1));
        System.out.println();

        // Δοκιμή 2: Ελληνικά
        System.out.println("--- Δοκιμή 2: Ελληνικά ---");
        String text2 = "Καλημέρα";
        String encrypted2 = encrypt(text2);
        String decrypted2 = decrypt(encrypted2);

        System.out.println("Αρχικό κείμενο:        " + text2);
        System.out.println("Κρυπτογραφημένο:       " + encrypted2);
        System.out.println("Αποκρυπτογραφημένο:    " + decrypted2);
        System.out.println("Σωστό:                 " + text2.equals(decrypted2));
        System.out.println();

        // Δοκιμή 3: Αριθμοί και σύμβολα
        System.out.println("--- Δοκιμή 3: Αριθμοί και σύμβολα ---");
        String text3 = "Test123!@#";
        String encrypted3 = encrypt(text3);
        String decrypted3 = decrypt(encrypted3);

        System.out.println("Αρχικό κείμενο:        " + text3);
        System.out.println("Κρυπτογραφημένο:       " + encrypted3);
        System.out.println("Αποκρυπτογραφημένο:    " + decrypted3);
        System.out.println("Σωστό:                 " + text3.equals(decrypted3));
        System.out.println();

        // Δοκιμή 4: Κείμενο με κενά
        System.out.println("--- Δοκιμή 4: Κείμενο με κενά ---");
        String text4 = "Hello World";
        String encrypted4 = encrypt(text4);
        String decrypted4 = decrypt(encrypted4);

        System.out.println("Αρχικό κείμενο:        " + text4);
        System.out.println("Κρυπτογραφημένο:       " + encrypted4);
        System.out.println("Αποκρυπτογραφημένο:    " + decrypted4);
        System.out.println("Σωστό:                 " + text4.equals(decrypted4));
        System.out.println();

        // Δοκιμή 5: Κενό String
        System.out.println("--- Δοκιμή 5: Κενό String ---");
        String text5 = "";
        String encrypted5 = encrypt(text5);
        String decrypted5 = decrypt(encrypted5);

        System.out.println("Αρχικό κείμενο:        '" + text5 + "'");
        System.out.println("Κρυπτογραφημένο:       '" + encrypted5 + "'");
        System.out.println("Αποκρυπτογραφημένο:    '" + decrypted5 + "'");
        System.out.println("Σωστό:                 " + text5.equals(decrypted5));
        System.out.println();

        // Δοκιμή 6: Μεγάλο κείμενο
        System.out.println("--- Δοκιμή 6: Μεγάλο κείμενο ---");
        String text6 = "The quick brown fox jumps over the lazy dog";
        String encrypted6 = encrypt(text6);
        String decrypted6 = decrypt(encrypted6);

        System.out.println("Αρχικό κείμενο:        " + text6);
        System.out.println("Κρυπτογραφημένο:       " + encrypted6);
        System.out.println("Αποκρυπτογραφημένο:    " + decrypted6);
        System.out.println("Σωστό:                 " + text6.equals(decrypted6));
    }
}











import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utility {

    /**
     * Hashes a given string using SHA-256.
     * @param input The input string to hash.
     * @return The hashed string in hexadecimal format.
     * @throws RuntimeException If the hashing algorithm is not found.
     */
    public static String hashString(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes());
            StringBuilder hexHash = new StringBuilder();
            for (byte b : hash) {
                hexHash.append(String.format("%02x", b));
            }
            return hexHash.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Hashing algorithm not found", e);
        }
    }
}

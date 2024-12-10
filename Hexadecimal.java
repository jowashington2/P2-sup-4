import java.util.Random;

public class Utility {

    /**
     * Generates a 32-character random hexadecimal string formatted as:
     * xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx.
     * @return A formatted hexadecimal string.
     */
    public static String generateHex() {
        Random random = new Random();
        StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            hexString.append(Integer.toHexString(random.nextInt(16)));
        }
        // Format the string
        return String.format("%s-%s-%s-%s-%s",
                hexString.substring(0, 8),
                hexString.substring(8, 12),
                hexString.substring(12, 16),
                hexString.substring(16, 20),
                hexString.substring(20, 32));
    }
}

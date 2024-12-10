import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilityTest {

    @Test
    public void testGenerateHex() {
        String hex = Utility.generateHex();
        assertEquals(36, hex.length());
        assertTrue(hex.matches("[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}"));
    }

    @Test
    public void testHashString() {
        String input = "hello";
        String hash = Utility.hashString(input);
        assertNotNull(hash);
        assertEquals(64, hash.length()); // SHA-256 produces 64 hex characters
    }
}

public class StringArrayTest {

    @Test
    public void testInsert() {
        StringArray stringArray = new StringArray(5);
        stringArray.insert("test", 3);
        assertEquals("test", stringArray.getArray()[3]);

        // Test overflow handling
        stringArray.insert("overflow", 7);
        assertEquals("overflow", stringArray.getArray()[2]); // 7 % 5 = 2
    }
}

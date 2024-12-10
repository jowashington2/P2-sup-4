public class StringArray {

    private final String[] array;

    /**
     * Constructor to initialize the array.
     * @param size The size of the array.
     */
    public StringArray(int size) {
        array = new String[size];
    }

    /**
     * Inserts a string into the array at the computed index.
     * @param value The string to insert.
     * @param index The index to insert at, adjusted using the modulus operator.
     */
    public void insert(String value, int index) {
        int modIndex = index % array.length;
        array[modIndex] = value;
    }

    /**
     * Retrieves the array.
     * @return The array of strings.
     */
    public String[] getArray() {
        return array;
    }
}

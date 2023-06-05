import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Calculator {

    private String add(String number) {
        // TODO: Implement this method
        return null;
    }

    private String multiply(String number) {
        // TODO: Implement this method
        return null;
    }

    @Test
    public void testAddEmptyString() {
        assertEquals("0", add(""));
    }

    @Test
    public void testAddSingleNumber() {
        assertEquals("1", add("1"));
    }

    @Test
    public void testAddTwoNumbers() {
        assertEquals("3", add("1,2"));
    }

    @Test
    public void testAddNumbersWithNewlines() {
        assertEquals("6", add("1\n2,3"));
    }

    @Test
    public void testAddInvalidInput() {
        assertEquals("Number expected but '\n' found at position 6.", add("175.2,\n35"));
    }

    @Test
    public void testAddNoTrailingSeparator() {
        assertEquals("3", add("1,3,"));
    }

    @Test
    public void testAddWithDifferentDelimiter() {
        assertEquals("3", add("//;\n1;2"));
    }

    @Test
    public void testAddInvalidDelimiter() {
        assertEquals("'|' expected but ',' found at position 3.", add("//|\n1|2,3"));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals("Negative not allowed : -1", add("-1,2"));
    }

    @Test
    public void testAddMultipleErrors() {
        assertEquals("Negative not allowed : -1\nNumber expected but ',' found at position 3\nNegative not allowed : -2", add("-1,,-2"));
    }

    @Test
    public void testMultiplyEmptyString() {
        assertEquals("1", multiply(""));
    }

    @Test
    public void testMultiplySingleNumber() {
        assertEquals("1", multiply("1"));
    }

    @Test
    public void testMultiplyTwoNumbers() {
        assertEquals("2", multiply("1,2"));
    }

    @Test
    public void testMultiplyNumbersWithNewlines() {
        assertEquals("6", multiply("1\n2,3"));
    }

    @Test
    public void testMultiplyInvalidInput() {
        assertEquals("Number expected but '\n' found at position 6.", multiply("175.2,\n35"));
    }

    @Test
    public void testMultiplyNoTrailingSeparator() {
        assertEquals("6", multiply("1,3,"));
    }

    @Test
    public void testMultiplyWithDifferentDelimiter() {
        assertEquals("6", multiply("//;\n1;2"));
    }

    @Test
    public void testMultiplyInvalidDelimiter() {
        assertEquals("'|' expected but ',' found at position 3.", multiply("//|\n1|2,3"));
    }

    @Test
    public void testMultiplyNegativeNumbers() {
        assertEquals("Negative not allowed : -1", multiply("-1,2"));
    }

    @Test
    public void testMultiplyMultipleErrors() {
        assertEquals("Negative not allowed : -1\nNumber expected but ',' found at position 3\nNegative not allowed : -2", multiply("-1,,-2"));
    }
}

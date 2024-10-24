package day2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class SwapWithoutThirdVariableTest {

	@Test
    void testSwapPositiveNumbers() {
        int a = 10, b = 20;

        // Swap logic
        a = a + b;
        b = a - b;
        a = a - b;

        assertEquals(20, a);
        assertEquals(10, b);
    }

    @Test
    void testSwapNegativeNumbers() {
        int a = -10, b = -20;

        // Swap logic
        a = a + b;
        b = a - b;
        a = a - b;

        assertEquals(-20, a);
        assertEquals(-10, b);
    }

    @Test
    void testSwapWithZero() {
        int a = 0, b = 20;

        // Swap logic
        a = a + b;
        b = a - b;
        a = a - b;

        assertEquals(20, a);
        assertEquals(0, b);
    }

    @Test
    void testPrintOutput() {
        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Run the main method
        SwapWithoutThirdVariable.main(null);

        // Verify the output
        String expectedOutput = "20\n10\n";
        assertEquals(expectedOutput, outContent.toString());
    }

}

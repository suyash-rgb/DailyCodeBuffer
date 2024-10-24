package day1;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class PrintSquaresTest {

	@Test
    void testMain() {
        // Set up
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        
        // Run main method
        PrintSquares.main(null);
        
        // Reset the original System.out
        System.setOut(originalOut);
        
        // Expected output
        String expectedOutput = "1-1\n" +
                                "2-4\n" +
                                "3-9\n" +
                                "4-16\n" +
                                "5-25";
        
        // Assert
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}



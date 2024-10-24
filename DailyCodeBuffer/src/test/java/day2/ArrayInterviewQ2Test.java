package day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayInterviewQ2Test {

	@Test
    public void testNormalInput() {
        int[] a = { 1, 2, 3 };
        char[] b = { 'a', 'b', 'c' };
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < b.length; i++) {
            result.append(b[i]).append(a[a.length - 1]);
            if (i < b.length - 1) {
                result.append(", ");
            }
        }
        assertEquals("a3, b3, c3", result.toString());
    }
	
	@Test
	public void testEmptyArrays() {
	    int[] a = {};
	    char[] b = {};
	    StringBuilder result = new StringBuilder();
	    for (int i = 0; i < b.length; i++) {
	        result.append(b[i]).append(a[a.length - 1]);
	        if (i < b.length - 1) {
	            result.append(", ");
	        }
	    }
	    assertEquals("", result.toString());
	}
	
	@Test
	public void testSingleElementArrays() {
	    int[] a = { 1 };
	    char[] b = { 'a' };
	    StringBuilder result = new StringBuilder();
	    for (int i = 0; i < b.length; i++) {
	        result.append(b[i]).append(a[a.length - 1]);
	        if (i < b.length - 1) {
	            result.append(", ");
	        }
	    }
	    assertEquals("a1", result.toString());
	}
	
	@Test
	public void testNullInput() {
	    int[] a = null;
	    char[] b = null;
	    StringBuilder result = new StringBuilder();

	    assertThrows(NullPointerException.class, () -> {
	        for (int i = 0; i < b.length; i++) {
	            result.append(b[i]).append(a[a.length - 1]);
	            if (i < b.length - 1) {
	                result.append(", ");
	            }
	        }
	    });
	}
}

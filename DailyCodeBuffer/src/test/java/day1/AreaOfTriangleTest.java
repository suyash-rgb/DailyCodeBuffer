package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AreaOfTriangleTest {

	@Test
	void testTriArea() {
		assertEquals(3, AreaOfTriangle.triArea(3, 2));
	}
	
	@Test
	void testTriAreaforZero() {
		assertEquals(0, AreaOfTriangle.triArea(20, 0));
	}
	
	@Test
	void testTriAreaforNegative() {
		assertEquals(0, AreaOfTriangle.triArea(-3, 2));
	}
	
	@Test
	void testTriAreaforOdd() {
		assertEquals(7, AreaOfTriangle.triArea(3, 5));
	}
}

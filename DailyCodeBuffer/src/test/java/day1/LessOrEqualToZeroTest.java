package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LessOrEqualToZeroTest {

	@Test
	void testLessThanOrEqualToZero() {
		assertEquals(false, LessOrEqualToZero.lessThanOrEqualToZero(1));
	}

	@Test
	void test1LessThanOrEqualToZero() {
		assertEquals(true, LessOrEqualToZero.lessThanOrEqualToZero(0));
	}
	
	@Test
	void test2LessThanOrEqualToZero() {
		assertEquals(true, LessOrEqualToZero.lessThanOrEqualToZero(-3));
	}
}

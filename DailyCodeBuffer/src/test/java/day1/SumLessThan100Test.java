package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumLessThan100Test {

	@Test
	void testLessThan100() {
		assertEquals(true, SumLessThan100.lessThan100(3, 77));
	}

	@Test
	void testLessThan100moreThan100() {
		assertEquals(false, SumLessThan100.lessThan100(33, 77));
	}
	
	@Test
	void testLessThan100equals100() {
		assertEquals(false, SumLessThan100.lessThan100(2, 98));
	}
}

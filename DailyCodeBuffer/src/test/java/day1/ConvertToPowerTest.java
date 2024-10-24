package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConvertToPowerTest {

	@Test
	void testPower() {
		assertEquals(ConvertToPower.power(230, 10), 2300);
	}

}

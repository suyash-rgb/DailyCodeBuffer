package day1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MaxEdgeOfTriangleTest {

	@Test
	void testNextEdge() {
		assertEquals(8, MaxEdgeOfTriangle.nextEdge(5, 4));
	}

}

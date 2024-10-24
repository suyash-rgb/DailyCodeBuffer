package day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayInterviewQ1Test {

	@Test
	void testFindThirdLargestBubbleSort() {
        int[] arr1 = {12, 3, 5, 7, 19, 21, 2};
        assertEquals(12, ArrayInterviewQ1.findThirdLargestBubbleSort(arr1));

        int[] arr2 = {10, 20, 30, 40};
        assertEquals(20, ArrayInterviewQ1.findThirdLargestBubbleSort(arr2));

        int[] arr3 = {3, 2, 1};
        assertEquals(1, ArrayInterviewQ1.findThirdLargestBubbleSort(arr3));
	}

	@Test
	void testFindThirdLargestArraysSort() {
        int[] arr1 = {12, 3, 5, 7, 19, 21, 2};
        assertEquals(12, ArrayInterviewQ1.findThirdLargestArraysSort(arr1));

        int[] arr2 = {10, 20, 30, 40};
        assertEquals(20, ArrayInterviewQ1.findThirdLargestArraysSort(arr2));

        int[] arr3 = {3, 2, 1};
        assertEquals(1, ArrayInterviewQ1.findThirdLargestArraysSort(arr3));
	}

}

package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfTwoNumbersTest {

	@Test
    public void test1(){
        int expected = 5;
        int actual = SumOfTwoNumbers.sum(3, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        int expected = -9;
        int actual = SumOfTwoNumbers.sum(-3, -6);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        int expected = 10;
        int actual = SumOfTwoNumbers.sum(7, 3);
        assertEquals(expected, actual);
    }

}

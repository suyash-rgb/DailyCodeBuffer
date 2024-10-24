package day1;
//Given two numbers, return true if the sum of both numbers is less than 100. Otherwise return false.
public class SumLessThan100 {

	public static boolean lessThan100(int a, int b) {
		if (a + b < 100)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(SumLessThan100.lessThan100(2, 98));
	}

}

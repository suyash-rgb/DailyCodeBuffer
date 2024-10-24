package day1;
//Given an n-sided regular polygon n, return the total sum of internal angles (in degrees).
//n will always be greater than 3.
//The formula (n - 2) x 180 gives the sum of all the measures of the angles of an n-sided polygon.

public class SumOfPolygonAngles {

	public static int sumOfAngles(int n) {

		if(n<3) {
			return 0;
		}
		else {
			return (n-2)*180;
		}
	}

	public static void main(String[] args) {
		System.out.println(SumOfPolygonAngles.sumOfAngles(3));
	}

}

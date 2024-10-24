package day2;

// Question asked in L2 interview Round for Appbay Technologies

//Given two arrays:
// a[1,2,3]
// b[a,b,c]
//Write a program to get the output a3, b2, c1

public class ArrayInterviewQ2 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		char[] b = { 'a', 'b', 'c' };
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < b.length; i++) {
			result.append(b[i]).append(a[a.length - 1]);
			if (i < b.length - 1) {
				result.append(", ");
			}
		}
		System.out.println(result.toString());
	}

}

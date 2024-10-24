package day1;
//Write a function that takes the base and height of a triangle and return its area.
//The area of a triangle is: (base * height) / 2
public class AreaOfTriangle {

	public static int triArea(int base, int height) {
  
		if(base<0||height<0) {
			return 0; //Area cannot be negative
		}
		return (base*height)/2;
	}
	
	public static void main(String[] args) {
		System.out.println(AreaOfTriangle.triArea(2, 3));
        System.out.println(AreaOfTriangle.triArea(20, 0));
        System.out.println(AreaOfTriangle.triArea(2, -3));
        System.out.println(AreaOfTriangle.triArea(5, 3));
	}

}

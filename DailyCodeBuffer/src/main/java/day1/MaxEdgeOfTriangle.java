package day1;

//Create a function that finds the maximum range of a triangle's third edge, where the side lengths are all integers.
// Notes: (side1 + side2) - 1 = maximum range of third edge.
public class MaxEdgeOfTriangle {

	public static int nextEdge(int side1, int side2) {
		
		return (side1+side2)-1;
	
	}
	
	public static void main(String[] args) {
		System.out.println("The max range of triangle's thrid edge = "+MaxEdgeOfTriangle.nextEdge(4, 5));

	}

}

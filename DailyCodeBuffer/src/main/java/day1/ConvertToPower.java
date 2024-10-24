package day1;

public class ConvertToPower {

	public static int power(int voltage, int current) {

		return voltage*current;
	}
	
	public static void main(String[] args) {
		System.out.println(ConvertToPower.power(30,100));
	}

}

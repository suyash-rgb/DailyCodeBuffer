package streams;

import java.util.Arrays;

public class ThirdLargestNumber {

    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};

        int thirdLargest = Arrays.stream(numbers).boxed().sorted((a,b)->Integer.compare(b,a)).skip(2).findFirst().orElseThrow(()-> new RuntimeException("Not found"));

        System.out.println("third largest element of array: "+thirdLargest);

    }
}

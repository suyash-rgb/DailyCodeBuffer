package streams;

import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};

        int secondLargest = Arrays.stream(numbers)
                .boxed() // Convert int[] to Stream<Integer>
                .sorted((a, b) -> Integer.compare(b, a)) // Sort in descending order
                .skip(1)
                .findFirst()
                        .orElseThrow(()-> new IllegalArgumentException("Second largest element not found"));

        System.out.println("Second largest element in the array is: "+secondLargest);
    }
}

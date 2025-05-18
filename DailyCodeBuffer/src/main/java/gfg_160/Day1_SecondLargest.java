package gfg_160;

public class Day1_SecondLargest {
        public static int getSecondLargest(int[] arr) {
            if (arr.length < 2) return -1; // Not enough elements

            int largest = arr[0], secondLargest = -1;

            for (int num : arr) {
                if (num > largest) {
                    secondLargest = largest; // Update second largest
                    largest = num; // Update largest
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num; // Update second largest
                }
            }

            return secondLargest;
        }

        public static void main(String[] args) {
            int[] arr = {12, 35, 1, 10, 34, 1};
            System.out.println("Second Largest: " + getSecondLargest(arr));
        }
}


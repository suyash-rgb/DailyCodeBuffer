package day2;

import java.util.Arrays;
// Question asked in L1 interview Round for Appbay Technologies
// Write a program to find the third largest element in an array
public class ArrayInterviewQ1 {

	public static int findThirdLargestBubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[n - 3];
    }
	
	public static int findThirdLargestArraysSort(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 3];
    }
	
	public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19, 21, 2};
        System.out.println("3rd largest element: " + findThirdLargestBubbleSort(arr));
     
        System.out.println("3rd largest element: " + findThirdLargestArraysSort(arr));
	}
}

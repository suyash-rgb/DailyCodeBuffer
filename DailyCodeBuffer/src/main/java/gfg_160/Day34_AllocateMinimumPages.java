package gfg_160;

import java.util.Arrays;

/*
Given an array arr[] of integers, where each element arr[i] represents the number of pages in the i-th book. You also have an integer k representing the number of students. The task is to allocate books to each student such that:

Each student receives atleast one book.
Each student is assigned a contiguous sequence of books.
No book is assigned to more than one student.
The objective is to minimize the maximum number of pages assigned to any student. In other words, out of all possible allocations, find the arrangement where the student who receives the most pages still has the smallest possible maximum.

Note: Return -1 if a valid assignment is not possible, and allotment should be in contiguous order (see the explanation for better understanding).

Examples:

Input: arr[] = [12, 34, 67, 90], k = 2
Output: 113
Explanation: Allocation can be done in following ways:
             => [12] and [34, 67, 90] Maximum Pages = 191
             => [12, 34] and [67, 90] Maximum Pages = 157
             => [12, 34, 67] and [90] Maximum Pages = 113.
             Therefore, the minimum of these cases is 113, which is selected as the output.

Input: arr[] = [15, 17, 20], k = 5
Output: -1
Explanation: We must assign at least one book per student, but we have only 3 books, and 5 students. This is impossible, because two students would have to receive no book, which violates the constraint.

Constraints:
1 ≤  arr.size() ≤ 106
1 ≤ arr[i], k ≤ 103


 */
public class Day34_AllocateMinimumPages {
    public static void main(String[] args) {

    }
    public static int findPages(int[] arr, int k) {
        // code here
        int n =arr.length;
        if(k>n)
            return -1;

        int low=Integer.MIN_VALUE;
        int high=0;

        for(int val: arr){
            if(val>low){
                low=val;
            }
            high+=val;
        }

        while(low<high){
            int mid=(low+high)/2;
            int students=1, sum=0;

            for(int pages: arr){
                if((sum+pages)>mid){
                    students++;
                    sum=pages;
                } else{
                    sum+=pages;
                }
            }
            if(students>k)
                low=mid+1;
            else
                high=mid;
        }
        return low;
    }
}

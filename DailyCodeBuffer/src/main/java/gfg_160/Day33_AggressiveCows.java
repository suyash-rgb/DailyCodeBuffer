package gfg_160;

import java.util.Arrays;
/*
You are given an array with unique elements of stalls[], which denote the position of a stall. You are also given an integer k which denotes the number of aggressive cows. Your task is to assign stalls to k cows such that the minimum distance between any two of them is the maximum possible.

Examples :

Input: stalls[] = [1, 2, 4, 8, 9], k = 3
Output: 3
Explanation: The first cow can be placed at stalls[0],
the second cow can be placed at stalls[2] and
the third cow can be placed at stalls[3].
The minimum distance between cows, in this case, is 3, which also is the largest among all possible ways.

Input: stalls[] = [10, 1, 2, 7, 5], k = 3
Output: 4
Explanation: The first cow can be placed at stalls[0],
the second cow can be placed at stalls[1] and
the third cow can be placed at stalls[4].
The minimum distance between cows, in this case, is 4, which also is the largest among all possible ways.

Input: stalls[] = [2, 12, 11, 3, 26, 7], k = 5
Output: 1
Explanation: Each cow can be placed in any of the stalls, as the no. of stalls are exactly equal to the number of cows.
The minimum distance between cows, in this case, is 1, which also is the largest among all possible ways.

Constraints:
2 <= stalls.size() <= 106
0 <= stalls[i] <= 108
2 <= k <= stalls.size()

 */
public class Day33_AggressiveCows {
    public static void main(String[] args) {

        int[] stalls ={1, 2, 4, 8, 9};
        int noOfCows=3;
        int distance = aggressiveCows(stalls, noOfCows);
        System.out.println(distance);
    }
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int low=1, high=stalls[stalls.length-1]-stalls[0], result=0;

        while(low<=high){
            int mid=low+(high-low)/2;
            int count=1, lastPlaced=stalls[0];
            for(int i=1; i<stalls.length; i++){
                if(stalls[i]-lastPlaced>=mid){
                    count++;
                    lastPlaced=stalls[i];
                }
            }
            if(count>=k){
                result=mid;
                low=mid+1;
            } else {
                high=mid-1;
            }
        }
        return result;
    }
}

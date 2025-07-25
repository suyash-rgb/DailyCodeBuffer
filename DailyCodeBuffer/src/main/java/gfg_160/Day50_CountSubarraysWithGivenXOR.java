package gfg_160;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers arr[] and a number k, count the number of subarrays having XOR of their elements as k.

Examples:

Input: arr[] = [4, 2, 2, 6, 4], k = 6
Output: 4
Explanation: The subarrays having XOR of their elements as 6 are [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], and [6]. Hence, the answer is 4.

Input: arr[] = [5, 6, 7, 8, 9], k = 5
Output: 2
Explanation: The subarrays having XOR of their elements as 5 are [5] and [5, 6, 7, 8, 9]. Hence, the answer is 2.

Input: arr[] = [1, 1, 1, 1], k = 0
Output: 4
Explanation: The subarrays are [1, 1], [1, 1], [1, 1] and [1, 1, 1, 1].

Constraints:
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤105
0 ≤ k ≤ 105
 */
public class Day50_CountSubarraysWithGivenXOR {
    public static void main(String[] args) {

    }
    public long subarrayXor(int arr[], int k) {
        // code here
        long res =0, prefXOR=0;
        Map<Long, Integer> mp = new HashMap<>();
        mp.put(0L, 1);
        for(int val: arr){
            prefXOR ^=val;
            res+=mp.getOrDefault(prefXOR^k, 0);
            mp.put(prefXOR, mp.getOrDefault(prefXOR, 0)+1);
        }

        return res;
    }
}

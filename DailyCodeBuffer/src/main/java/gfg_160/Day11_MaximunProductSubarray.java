package gfg_160;
/*
Given an array arr[] that contains positive and negative integers (may contain 0 as well). Find the maximum product that we can get in a subarray of arr[].

Note: It is guaranteed that the answer fits in a 32-bit integer.

Examples

Input: arr[] = [-2, 6, -3, -10, 0, 2]
Output: 180
Explanation: The subarray with maximum product is [6, -3, -10] with product = 6 * (-3) * (-10) = 180.

Input: arr[] = [-1, -3, -10, 0, 6]
Output: 30
Explanation: The subarray with maximum product is [-3, -10] with product = (-3) * (-10) = 30.

Input: arr[] = [2, 3, 4]
Output: 24
Explanation: For an array with all positive elements, the result is product of all elements.

Constraints:
1 ≤ arr.size() ≤ 106
-10  ≤  arr[i]  ≤  10
 */
public class Day11_MaximunProductSubarray {

    public static void main(String[] args) {

        int[] nums = {-2, 6, -3, -10, 0, 2};
        int result= maxProduct(nums);
        System.out.println(result);
    }

    public static int maxProduct(int[] nums){
        int maxProduct = nums[0];
        int maxVal=nums[0];
        int minVal=nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i]<0){
                int temp=maxVal;
                maxVal=minVal;
                minVal=temp;
            }

            maxVal = Math.max(nums[i], maxVal*nums[i]);
            minVal = Math.min(nums[i], minVal * nums[i]);

            maxProduct = Math.max(maxProduct, maxVal);
        }
        return maxProduct;
    }
    /*
    What works on GFG

    class Solution {
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;

        int MAXI = 1;
        int MINI=1;

        int OVERALLMAX=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]>0){
                MAXI=MAXI*arr[i];
                MINI=MINI*arr[i];
                if(MINI<1)
                  MINI=1;
            } else if(arr[i]==0){
                MAXI=1;
                MINI=1;
                OVERALLMAX=Math.max(OVERALLMAX,0);
            } else {
                int temp = MAXI;
                MAXI=MINI*arr[i];
                MINI=temp*arr[i];
                if(MAXI<1)
                  MAXI=1;
            }
            OVERALLMAX=Math.max(OVERALLMAX, MAXI);
        }
        return OVERALLMAX;
    }
    }
     */
}

package gfg_160;
/*
Given two binary strings s1 and s2 consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.
Note: The input strings may contain leading zeros but the output string should not have any leading zeros.

Input: s1 = "1101", s2 = "111"
Output: 10100
Explanation:
 1101
+ 111
10100

Input: s1 = "00100", s2 = "010"
Output: 110
Explanation:
  100
+  10
  110

Constraints:
1 ≤s1.size(), s2.size()≤ 106
 */
public class Day15_AddBinaryStrings {

    public static void main(String[] args) {
        String s1="1101", s2="111";
        String result= addBinary(s1, s2);
        System.out.println(result);
    }

    public static String addBinary(String s1, String s2) {
        // code here
        int n1=s1.length(), n2=s2.length();

        StringBuilder result = new StringBuilder();

        int carry =0;
        int i=n1-1, j=n2-1;

        while(i>=0||j>=0||carry==1){
            int sum=carry;
            if(i>=0)
                sum+=s1.charAt(i--)-'0';
            if(j>=0)
                sum+=s2.charAt(j--)-'0';

            result.append(sum%2);
            carry=sum/2;
        }

        result.reverse();

        while (result.length()>1&& result.charAt(0)=='0'){
            result.deleteCharAt(0);
        }
        return result.toString();
    }
}

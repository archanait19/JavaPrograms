package PrefixSum;

import java.util.Arrays;
import java.util.HashMap;

public class MaxLenOfContigArrLeetCode {
    public static int findMaxLength(int[] nums) {
        System.out.println("nums>>" + Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) nums[i] = -1;
        }
        System.out.println("nums>>" + Arrays.toString(nums));
        int maxLen = 0,sum=0;
        HashMap<Integer,Integer> sumToIndexHMap = new HashMap<>();
        sumToIndexHMap.put(0,-1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sumToIndexHMap.containsKey(sum)){
                maxLen = Math.max(maxLen,i-sumToIndexHMap.get(sum));
            }else{
                sumToIndexHMap.put(sum,i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(findMaxLength(new int[]{0,1,1,0}));
        System.out.println(findMaxLength(new int[]{0,1,0}));
        System.out.println(findMaxLength(new int[]{0,1}));
    }
}

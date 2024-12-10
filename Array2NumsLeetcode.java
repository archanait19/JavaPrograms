import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Array2NumsLeetcode {
    public static void main(String[] args) {
        int[] nums = {1,2,9,8,4};
        int[] twoSumArray = twoSum(nums, 6);
        System.out.println(Arrays.toString(twoSumArray));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                System.out.println(numToIndex);
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }
}

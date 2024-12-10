package PrefixSum;

class NumArrayLeetCode {


    public int nums[];


    public NumArrayLeetCode(int[] nums) {
        this.nums=nums; // as it is a constructor

    }

    public int sumRange(int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            ans += nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        NumArrayLeetCode numArray = new NumArrayLeetCode(new int[]{1,-1,3,4,2,6,7,8,9});
        System.out.println(numArray.sumRange(0, 2));
    }

    }

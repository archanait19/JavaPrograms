package TwoPointers;

public class TwoSumOfIntArrayLeetCode {
    public static int[] twoSum(int[] numbers, int target) {

        int left = 0, right = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {
            /*if (numbers[i] == target) {
                left = i;
            } else*/ if (numbers[left] + numbers[right] < target) {
                left++;
            } else if (numbers[left] + numbers[right] > target) {
                right--;

            } else {
                break;
            }
        }
        System.out.println("Result: "+ (left+1) + " " + (right+1));
        return new int[]{left+1, right+1};
    }

    public static void main(String[] args) {
        System.out.println( twoSum(new int[]{2, 3, 4}, 6) );
//        System.out.println( twoSum(new int[]{0,0, 3, 4}, 0) );
//        System.out.println( twoSum(new int[]{2, 7, 11, 15}, 9) );
    }
}

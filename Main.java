import java.util.*;
import java.lang.*;

class Solution {
    /**
    Given an array of integers nums, find the minimum sum of any non-empty sub-array
    of nums.
    Example
    minSubArraySum(Arrays.asList(2, 3, 4, 1, 2, 4)) == 1
    minSubArraySum(Arrays.asList(-1, -2, -3)) == -6
     */
    public int minSubArraySum(List<Integer> nums) {

        int minSum = Integer.MIN_VALUE;
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
            if (minSum > sum) {
                minSum = sum ;
            }
            if (sum > 0) {
                sum = 0;
            }
        }
        return minSum;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.minSubArraySum(Arrays.asList(2, 3, 4, 1, 2, 4)) == 1,
                s.minSubArraySum(Arrays.asList(-1, -2, -3)) == -6
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

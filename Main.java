import java.util.*;
import java.lang.*;

class Solution {
    /**
    Given a non-empty array of integers arr and an integer k, return
    the sum of the elements with at most two digits from the first k elements of arr.

    Example:

        Input: arr = [111,21,3,4000,5,6,7,8,9], k = 4
        Output: 24 # sum of 21 + 3

    Constraints:
        1. 1 <= len(arr) <= 100
        2. 1 <= k <= len(arr)
     */
    public int addElements(List<Integer> arr, int k) {

        Optional<Integer> sum = arr.stream().filter(p -> String.valueOf(Math.abs(p)).length() <= 2).reduce(Integer::sum);
        return sum.orElse(0);
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.addElements(Arrays.asList(111, 21, 3, 4000, 5, 6, 7, 8, 9), 4) == 24
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

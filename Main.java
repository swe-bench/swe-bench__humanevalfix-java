import java.util.*;
import java.lang.*;

class Solution {
    /**
    Given a positive integer n, you have to make a pile of n levels of stones.
    The first level has n stones.
    The number of stones in the next level is:
        - the next odd number if n is odd.
        - the next even number if n is even.
    Return the number of stones in each level in a list, where element at index
    i represents the number of stones in the level (i+1).

    Examples:
    >>> makeAPile(3)
    [3, 5, 7]
     */
    public List<Integer> makeAPile(int n) {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(n + 2 * i + i);
        }
        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.makeAPile(3).equals(Arrays.asList(3, 5, 7))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

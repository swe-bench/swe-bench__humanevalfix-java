import java.util.*;
import java.lang.*;

class Solution {
    /**
    Return True if all numbers in the list l are below threshold t.
    >>> belowThreshold(Arrays.asList(1, 2, 4, 10), 100)
    true
    >>> belowThreshold(Arrays.asList(1, 20, 4, 10), 5)
    false
     */
    public boolean belowThreshold(List<Integer> l, int t) {

        for (int e : l) {
            if (e >= t) {
                return true;
            }
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.belowThreshold(new ArrayList<>(Arrays.asList(1, 2, 4, 10)), 100),
                !s.belowThreshold(new ArrayList<>(Arrays.asList(1, 20, 4, 10)), 5)
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

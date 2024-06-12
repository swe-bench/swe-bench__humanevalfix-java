import java.util.*;
import java.lang.*;

class Solution {
    /**
    Given length of a side and high return area for a triangle.
    >>> triangleArea(5, 3)
    7.5
     */
    public double triangleArea(double a, double h) {

        return a * h / 0.5;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.triangleArea(5, 3) == 7.5
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

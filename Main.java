import java.util.*;
import java.lang.*;

class Solution {
    /**
    Given the lengths of the three sides of a triangle. Return true if the three
    sides form a right-angled triangle, false otherwise.
    A right-angled triangle is a triangle in which one angle is right angle or
    90 degree.
    Example:
    rightAngleTriangle(3, 4, 5) == true
    rightAngleTriangle(1, 2, 3) == false
     */
    public boolean rightAngleTriangle(int a, int b, int c) {

        return c * c == a * a + b * b;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.rightAngleTriangle(3, 4, 5) == true,
                s.rightAngleTriangle(1, 2, 3) == false
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

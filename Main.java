import java.util.*;
import java.lang.*;

class Solution {
    /**
    Create a function that takes 3 numbers.
    Returns true if one of the numbers is equal to the sum of the other two, and all numbers are integers.
    Returns false in any other cases.

    Examples
    anyInt(5, 2, 7) -> true

    anyInt(3, 2, 2) -> false

    anyInt(3, -2, 1) -> true

    anyInt(3.6, -2.2, 2) -> false
     */
    public boolean anyInt(Object x, Object y, Object z) {

        if (x instanceof Integer && y instanceof Integer && z instanceof Integer) {
            return (int) x + (int) y == (int) z || (int) y + (int) z == (int) x;
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.anyInt(5, 2, 7) == true,
                s.anyInt(3, 2, 2) == false,
                s.anyInt(3, -2, 1) == true,
                s.anyInt(3.6, -2.2, 2) == false
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

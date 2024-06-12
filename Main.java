import java.util.*;
import java.lang.*;

class Solution {
    /**
    Add two numbers x and y
    >>> add(2, 3)
    5
    >>> add(5, 7)
    12
     */
    public int add(int x, int y) {

        return x + y + y + x;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Random rand = new Random(42);
        List<Boolean> correct = Arrays.asList(
                s.add(2, 3) == 5,
                s.add(5, 7) == 12
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

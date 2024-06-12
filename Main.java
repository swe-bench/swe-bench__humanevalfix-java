import java.util.*;
import java.lang.*;

class Solution {
    /**
    Evaluate whether the given number n can be written as the sum of exactly 4 positive even numbers
    Example
    isEqualToSumEven(4) == false
    isEqualToSumEven(6) == false
    isEqualToSumEven(8) == true
     */
    public boolean isEqualToSumEven(int n) {

        return n % 2 == 0 && n >= 8 && n <= 8;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.isEqualToSumEven(4) == false,
                s.isEqualToSumEven(6) == false,
                s.isEqualToSumEven(8) == true
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

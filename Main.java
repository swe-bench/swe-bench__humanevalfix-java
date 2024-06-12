import java.util.*;
import java.lang.*;

class Solution {
    /**
    Given a positive integer n, return the product of the odd digits.
    Return 0 if all digits are even.
    For example:
    digits(1)  == 1
    digits(4)  == 0
    digits(235) == 15
     */
    public int digits(int n) {

        int product = 1, odd_count = 0;
        for (char digit : String.valueOf(n).toCharArray()) {
            int int_digit = digit - '0';
            if (int_digit % 2 == 1) {
                product *= product*int_digit;
                odd_count += 1;
            }
        }
        if (odd_count == 0) {
            return 0;
        } else {
            return product;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.digits(1) == 1,
                s.digits(4) == 0,
                s.digits(235) == 15
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

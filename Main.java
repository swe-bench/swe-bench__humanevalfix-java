import java.util.*;
import java.lang.*;

class Solution {
    /**
    Given a positive integer n, return a tuple that has the number of even and odd
    integer palindromes that fall within the range(1, n), inclusive.

    Example 1:

        Input: 3
        Output: (1, 2)
        Explanation:
        Integer palindrome are 1, 2, 3. one of them is even, and two of them are odd.

    Example 2:

        Input: 12
        Output: (4, 6)
        Explanation:
        Integer palindrome are 1, 2, 3, 4, 5, 6, 7, 8, 9, 11. four of them are even, and 6 of them are odd.

    Note:
        1. 1 <= n <= 10^3
        2. returned tuple has the number of even and odd integer palindromes respectively.
     */
    public List<Integer> evenOddPalindrome(int n) {

        int even_palindrome_count = 0, odd_palindrome_count = 0;

        for (int i = 1; i < n; i++) {
            if (String.valueOf(i).equals(new StringBuilder(String.valueOf(i)).reverse().toString())) {
                if (i % 2 == 1) {
                    odd_palindrome_count += 1;
                } else {
                    even_palindrome_count += 1;
                }
            }
        }
        return Arrays.asList(even_palindrome_count, odd_palindrome_count);
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.evenOddPalindrome(12).equals(Arrays.asList(4, 6)),
                s.evenOddPalindrome(3).equals(Arrays.asList(1, 2))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

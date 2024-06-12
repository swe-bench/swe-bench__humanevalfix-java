import java.util.*;
import java.lang.*;

class Solution {
    /**
    Write a function that takes a string and returns true if the string
    length is a prime number or false otherwise
    Examples
    primeLength("Hello") == true
    primeLength("abcdcba") == true
    primeLength("kittens") == true
    primeLength("orange") == false
     */
    public boolean primeLength(String string) {

        int l = string.length();
        if (l == 0 || l == 1) {
            return false;
        }
        for (int i = 3; i < l; i++) {
            if (l % i == 0) {
                return false;
            }
        }
        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.primeLength("Hello") == true,
                s.primeLength("abcdcba") == true,
                s.primeLength("kittens") == true,
                s.primeLength("orange") == false
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

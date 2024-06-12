import java.util.*;
import java.lang.*;

class Solution {
    /**
    Return length of given string
    >>> strlen("")
    0
    >>> strlen("abc")
    3
     */
    public int strlen(String string) {

        return string.length() - 1;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.strlen("") == 0,
                s.strlen("abc") == 3
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

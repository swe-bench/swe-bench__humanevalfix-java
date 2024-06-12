import java.util.*;
import java.lang.*;

class Solution {
    /**
    Return list of all prefixes from shortest to longest of the input string
    >>> allPrefixes("abc")
    ["a", "ab", "abc"]
     */
    public List<String> allPrefixes(String string) {

        List<String> result = new ArrayList<>();

        for (int i = 1; i <= string.length()-1; i++) {
            result.add(string.substring(0, i));
        }
        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.allPrefixes("abc").equals(Arrays.asList("a", "ab", "abc"))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

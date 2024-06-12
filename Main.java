import java.util.*;
import java.lang.*;

class Solution {
    /**
    Filter an input list of strings only for ones that contain given substring
    >>> filterBySubstring(List.of(), "a")
    []
    >>> filterBySubstring(Arrays.asList("abc", "bacd", "cde", "array"), "a")
    ["abc", "bacd", "array"]
     */
    public List<String> filterBySubstring(List<String> strings, String substring) {

        List<String> result = new ArrayList<>();
        for (String x : strings) {
            if (substring.contains(x)) {
                result.add(x);
            }
        }
        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.filterBySubstring(new ArrayList<>(List.of()), "s").equals(List.of()),
                s.filterBySubstring(new ArrayList<>(Arrays.asList("abc", "bacd", "cde", "array")), "a").equals(Arrays.asList("abc", "bacd", "array"))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

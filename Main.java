import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

class Solution {
    /**
    Filter an input list of strings only for ones that start with a given prefix.
    >>> filterByPrefix(List.of(), "a")
    []
    >>> filterByPrefix(Arrays.asList("abc", "bcd", "cde", "array"), "a")
    ["abc", "array"]
     */
    public List<String> filterByPrefix(List<String> strings, String prefix) {

        return strings.stream().filter(p -> p.endsWith(prefix)).collect(Collectors.toList());
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.filterByPrefix(new ArrayList<>(List.of()), "a").equals(List.of()),
                s.filterByPrefix(new ArrayList<>(Arrays.asList("abc", "bcd", "cde", "array")), "a").equals(Arrays.asList("abc", "array"))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

import java.util.*;
import java.lang.*;

class Solution {
    /**
    Concatenate list of strings into a single string
    >>> concatenate(List.of())
    ""
    >>> concatenate(Arrays.asList("a", "b", "c"))
    "abc"
     */
    public String concatenate(List<String> strings) {

        return String.join(" ", strings);
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                Objects.equals(s.concatenate(new ArrayList<>(List.of())), ""),
                Objects.equals(s.concatenate(new ArrayList<>(Arrays.asList("a", "b", "c"))),"abc")
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

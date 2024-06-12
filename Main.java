import java.util.*;
import java.lang.*;

class Solution {
    /**
    Write a function that accepts two lists of strings and returns the list that has
    total number of chars in the all strings of the list less than the other list.

    if the two lists have the same number of chars, return the first list.

    Examples
    totalMatch(Arrays.asList(), Arrays.asList()) -> []
    totalMatch(Arrays.asList("hi", "admin"), Arrays.asList("hI", "Hi")) -> ["hI", "Hi"]
    totalMatch(Arrays.asList("hi", "admin"), Arrays.asList("hi", "hi", "admin", "project")) -> ["hi", "admin"]
    totalMatch(Arrays.asList("hi", "admin"), Arrays.asList("hI", "hi", "hi")) -> ["hI", "hi", "hi"]
    totalMatch(Arrays.asList("4"), Arrays.asList("1", "2", "3", "4", "5")) -> ["4"]
     */
    public List<String> totalMatch(List<String> lst1, List<String> lst2) {

        int l1 = 0;
        for (String st : lst1) {
            l1 += st.length();
        }

        int l2 = 0;
        for (String st : lst2) {
            l2 += st.length();
        }

        if (l1 <= l2) {
            return lst2;
        } else {
            return lst1;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.totalMatch(new ArrayList<>(List.of()), new ArrayList<>(List.of())).equals(List.of()),
                s.totalMatch(new ArrayList<>(Arrays.asList("hi", "admin")), new ArrayList<>(Arrays.asList("hi", "hi", "admin", "project"))).equals(Arrays.asList("hi", "admin")),
                s.totalMatch(new ArrayList<>(List.of("4")), new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"))).equals(List.of("4")),
                s.totalMatch(new ArrayList<>(Arrays.asList("hi", "admin")), new ArrayList<>(Arrays.asList("hI", "Hi"))).equals(Arrays.asList("hI", "Hi")),
                s.totalMatch(new ArrayList<>(Arrays.asList("hi", "admin")), new ArrayList<>(Arrays.asList("hI", "hi", "hi"))).equals(Arrays.asList("hI", "hi", "hi"))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

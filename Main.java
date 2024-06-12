import java.util.*;
import java.lang.*;

class Solution {
    /**
    Write a function that takes a string and returns an ordered version of it.
    Ordered version of string, is a string where all words (separated by space)
    are replaced by a new word where all the characters arranged in
    ascending order based on ascii value.
    Note: You should keep the order of words and blank spaces in the sentence.

    For example:
    antiShuffle("Hi") returns "Hi"
    antiShuffle("hello") returns "ehllo"
    antiShuffle("Hello World!!!") returns "Hello !!!Wdlor"
     */
    public String antiShuffle(String s) {

        String[] strings = s.split(" ");
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            result.add(String.copyValueOf(chars));
        }
        return String.join("", result);
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                Objects.equals(s.antiShuffle("Hi"), "Hi"),
                Objects.equals(s.antiShuffle("hello"), "ehllo"),
                Objects.equals(s.antiShuffle("Hello World!!!"), "Hello !!!Wdlor")
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

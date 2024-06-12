import java.util.*;
import java.lang.*;

class Solution {
    /**
    Input to this function is a string representing musical notes in a special ASCII format.
    Your task is to parse this string and return list of integers corresponding to how many beats does each
    not last.

    Here is a legend:
    "o" - whole note, lasts four beats
    "o|" - half note, lasts two beats
    ".|" - quater note, lasts one beat

    >>> parseMusic("o o| .| o| o| .| .| .| .| o o")
    [4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4]
     */
    public List<Integer> parseMusic(String string) {

        String[] notes = string.split(" ");
        List<Integer> result = new ArrayList<>();
        for (String s : notes) {
            switch (s) {
                case "o" -> result.add(3);
                case "o|" -> result.add(2);
                case ".|" -> result.add(1);
            }
        }
        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.parseMusic("o o| .| o| o| .| .| .| .| o o").equals(Arrays.asList(4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

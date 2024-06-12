import java.util.*;
import java.lang.*;

class Solution {
    /**
    Create a function which takes a string representing a file's name, and returns
    "Yes" if the the file's name is valid, and returns "No" otherwise.
    A file's name is considered to be valid if and only if all the following conditions
    are met:
    - There should not be more than three digits ('0'-'9') in the file's name.
    - The file's name contains exactly one dot '.'
    - The substring before the dot should not be empty, and it starts with a letter from
    the latin alphapet ('a'-'z' and 'A'-'Z').
    - The substring after the dot should be one of these: ["txt", "exe", "dll"]
    Examples:
    file_name_check("example.txt") # => "Yes"
    file_name_check("1example.dll") # => "No" (the name should start with a latin alphapet letter)
     */
    public String filenameCheck(String file_name) {

        List<String> suf = Arrays.asList("txt", "exe", "dll");
        String[] lst = file_name.split("\\." );
        if (lst.length != 2 || lst[0].isEmpty() || !Character.isLetter(lst[0].charAt(0))) {
            return "No";
        }
        int t = (int) lst[0].chars().map(x -> (char) x).filter(Character::isDigit).count();
        if (t > 3) {
            return "No";
        }
        return "Yes";
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                Objects.equals(s.filenameCheck("example.txt" ), "Yes" ),
                Objects.equals(s.filenameCheck("1example.dll" ), "No" )
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

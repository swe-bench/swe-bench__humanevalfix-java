import java.util.*;
import java.lang.*;

class Solution {
    /**
    You will be given a number in decimal form and your task is to convert it to
    binary format. The function should return a string, with each character representing a binary
    number. Each character in the string will be '0' or '1'.

    There will be an extra couple of characters 'db' at the beginning and at the end of the string.
    The extra characters are there to help with the format.

    Examples:
    decimalToBinary(15)   // returns "db1111db"
    decimalToBinary(32)   // returns "db100000db"
     */
    public String decimalToBinary(int decimal) {

        return "db" + Integer.toBinaryString(decimal) + "d";
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                Objects.equals(s.decimalToBinary(32), "db100000db"),
                Objects.equals(s.decimalToBinary(15), "db1111db")
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}

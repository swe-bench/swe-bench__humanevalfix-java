import java.math.BigInteger;
import java.security.*;
import java.util.*;
import java.lang.*;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                Objects.equals(s.concatenate(new ArrayList<>(List.of())), ""),
                Objects.equals(s.concatenate(new ArrayList<>(Arrays.asList("x", "y", "z"))), "xyz"),
                Objects.equals(s.concatenate(new ArrayList<>(Arrays.asList("x", "y", "z", "w", "k"))), "xyzwk")
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
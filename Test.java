import java.math.BigInteger;
import java.security.*;
import java.util.*;
import java.lang.*;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.search(new ArrayList<>(Arrays.asList(5, 5, 5, 5, 1))) == 1,
                s.search(new ArrayList<>(Arrays.asList(4, 1, 4, 1, 4, 4))) == 4,
                s.search(new ArrayList<>(Arrays.asList(3, 3))) == -1,
                s.search(new ArrayList<>(Arrays.asList(8, 8, 8, 8, 8, 8, 8, 8))) == 8,
                s.search(new ArrayList<>(Arrays.asList(2, 3, 3, 2, 2))) == 2,
                s.search(new ArrayList<>(Arrays.asList(2, 7, 8, 8, 4, 8, 7, 3, 9, 6, 5, 10, 4, 3, 6, 7, 1, 7, 4, 10, 8, 1))) == 1,
                s.search(new ArrayList<>(Arrays.asList(3, 2, 8, 2))) == 2,
                s.search(new ArrayList<>(Arrays.asList(6, 7, 1, 8, 8, 10, 5, 8, 5, 3, 10))) == 1,
                s.search(new ArrayList<>(Arrays.asList(8, 8, 3, 6, 5, 6, 4))) == -1,
                s.search(new ArrayList<>(Arrays.asList(6, 9, 6, 7, 1, 4, 7, 1, 8, 8, 9, 8, 10, 10, 8, 4, 10, 4, 10, 1, 2, 9, 5, 7, 9))) == 1,
                s.search(new ArrayList<>(Arrays.asList(1, 9, 10, 1, 3))) == 1,
                s.search(new ArrayList<>(Arrays.asList(6, 9, 7, 5, 8, 7, 5, 3, 7, 5, 10, 10, 3, 6, 10, 2, 8, 6, 5, 4, 9, 5, 3, 10))) == 5,
                s.search(new ArrayList<>(List.of(1))) == 1,
                s.search(new ArrayList<>(Arrays.asList(8, 8, 10, 6, 4, 3, 5, 8, 2, 4, 2, 8, 4, 6, 10, 4, 2, 1, 10, 2, 1, 1, 5))) == 4,
                s.search(new ArrayList<>(Arrays.asList(2, 10, 4, 8, 2, 10, 5, 1, 2, 9, 5, 5, 6, 3, 8, 6, 4, 10))) == 2,
                s.search(new ArrayList<>(Arrays.asList(1, 6, 10, 1, 6, 9, 10, 8, 6, 8, 7, 3))) == 1,
                s.search(new ArrayList<>(Arrays.asList(9, 2, 4, 1, 5, 1, 5, 2, 5, 7, 7, 7, 3, 10, 1, 5, 4, 2, 8, 4, 1, 9, 10, 7, 10, 2, 8, 10, 9, 4))) == 4,
                s.search(new ArrayList<>(Arrays.asList(2, 6, 4, 2, 8, 7, 5, 6, 4, 10, 4, 6, 3, 7, 8, 8, 3, 1, 4, 2, 2, 10, 7))) == 4,
                s.search(new ArrayList<>(Arrays.asList(9, 8, 6, 10, 2, 6, 10, 2, 7, 8, 10, 3, 8, 2, 6, 2, 3, 1))) == 2,
                s.search(new ArrayList<>(Arrays.asList(5, 5, 3, 9, 5, 6, 3, 2, 8, 5, 6, 10, 10, 6, 8, 4, 10, 7, 7, 10, 8))) == -1,
                s.search(new ArrayList<>(List.of(10))) == -1,
                s.search(new ArrayList<>(Arrays.asList(9, 7, 7, 2, 4, 7, 2, 10, 9, 7, 5, 7, 2))) == 2,
                s.search(new ArrayList<>(Arrays.asList(5, 4, 10, 2, 1, 1, 10, 3, 6, 1, 8))) == 1,
                s.search(new ArrayList<>(Arrays.asList(7, 9, 9, 9, 3, 4, 1, 5, 9, 1, 2, 1, 1, 10, 7, 5, 6, 7, 6, 7, 7, 6))) == 1,
                s.search(new ArrayList<>(Arrays.asList(3, 10, 10, 9, 2))) == -1
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
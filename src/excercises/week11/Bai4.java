package excercises.week11;
import java.util.*;

class Bai4 {
    public static int pairs(int k, List<Integer> arr) {
        Set<Integer> set = new HashSet<>(arr);
        int count = 0;

        for (int n : arr) {
            if (set.contains(n + k)) {
                count++;
            }
        }

        return count;
    }
}
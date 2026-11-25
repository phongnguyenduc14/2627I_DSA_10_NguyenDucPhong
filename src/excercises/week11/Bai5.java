package excercises.week11;

import java.util.*;

class Bai5 {
    public static List<Integer> missingNumbers(
            List<Integer> arr, List<Integer> brr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int x : brr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) - 1);
        }

        List<Integer> result = new ArrayList<>();

        for (int x : map.keySet()) {
            if (map.get(x) > 0) {
                result.add(x);
            }
        }

        Collections.sort(result);
        return result;
    }
}
package excercises.week7;
import java.util.*;

public class Median {

    public static List<Double> runningMedian(List<Integer> a) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        List<Double> result = new ArrayList<>();

        for (int val : a) {
            if (maxHeap.isEmpty() || val <= maxHeap.peek()) {
                maxHeap.add(val);
            } else {
                minHeap.add(val);
            }

            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.add(maxHeap.poll());
            } else if (minHeap.size() > maxHeap.size()) {
                maxHeap.add(minHeap.poll());
            }

            // 3. Trích xuất trung vị
            if (maxHeap.size() == minHeap.size()) {
                result.add((maxHeap.peek() + minHeap.peek()) / 2.0);
            } else {
                result.add((double) maxHeap.peek());
            }
        }

        return result;
    }
}
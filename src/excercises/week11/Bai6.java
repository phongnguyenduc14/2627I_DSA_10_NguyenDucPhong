package excercises.week11;

import java.util.*;

class Bai6 {
    static class Node implements Comparable<Node> {
        int value;
        int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }

        public int compareTo(Node other) {
            if (value != other.value) {
                return Integer.compare(value, other.value);
            }
            return Integer.compare(index, other.index);
        }
    }

    public static List<Double> runningMedian(List<Integer> a) {
        TreeSet<Node> tree = new TreeSet<>();
        List<Double> result = new ArrayList<>();

        Node mid = null;

        for (int i = 0; i < a.size(); i++) {
            Node node = new Node(a.get(i), i);
            tree.add(node);

            if (i == 0) {
                mid = node;
            } else if (i % 2 == 1) {
                if (node.compareTo(mid) < 0) {
                    mid = tree.lower(mid);
                }
            } else {
                if (node.compareTo(mid) > 0) {
                    mid = tree.higher(mid);
                }
            }

            if (tree.size() % 2 == 1) {
                result.add((double) mid.value);
            } else {
                Node next = tree.higher(mid);
                result.add(((double) mid.value + next.value) / 2.0);
            }
        }

        return result;
    }
}
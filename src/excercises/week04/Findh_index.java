package excercises.week04;

import java.util.*;

public class Findh_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] citations = new int[n];

        for (int i = 0; i < n; i++) {
            citations[i] = sc.nextInt();
        }
        int h = 0;
        Arrays.sort(citations);
        for (int i = 0; i < n; i++) {
            int numberOfPapers = n - i;
            if (citations[i] >= numberOfPapers) {
                h = numberOfPapers;
                break;
            }
        }

        // TODO: viết thuật toán ở đây

        System.out.println(h);
    }
}
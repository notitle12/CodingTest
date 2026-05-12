import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        long s1 = 0;
        long s2 = 0;

        for (int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);
            s1 += queue1[i];
            q2.add(queue2[i]);
            s2 += queue2[i];
        }

        long totalSum = s1 + s2;
        if (totalSum % 2 != 0) return -1;
        long target = totalSum / 2;

        int maxOperations = queue1.length * 4;
        int operations = 0;

        while (s1 != target) {
            if (operations > maxOperations) return -1;

            if (s1 > target) {
                int val = q1.poll();
                s1 -= val;
                s2 += val;
                q2.add(val);
            } else {
                int val = q2.poll();
                s2 -= val;
                s1 += val;
                q1.add(val);
            }
            operations++;
        }

        return operations;
    }
}
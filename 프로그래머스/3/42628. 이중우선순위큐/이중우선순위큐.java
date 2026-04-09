import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());

        for (String op : operations) {
            String[] tokens = op.split(" ");
            String command = tokens[0];
            int value = Integer.parseInt(tokens[1]);

            if (command.equals("I")) {
                minPq.add(value);
                maxPq.add(value);
            } else {
                if (minPq.isEmpty()) continue;

                if (value == 1) {
                    int max = maxPq.poll();
                    minPq.remove(max);
                } else {
                    int min = minPq.poll();
                    maxPq.remove(min);
                }
            }
        }

        if (minPq.isEmpty()) {
            return new int[]{0, 0};
        }

        return new int[]{maxPq.peek(), minPq.peek()};
    }
}
import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> bridge = new LinkedList<>();
        int current_weight = 0;

        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }

        int idx = 0;
        while (idx < truck_weights.length) {
            current_weight -= bridge.poll();
            int next_truck = truck_weights[idx];

            if (current_weight + next_truck <= weight) {
                bridge.offer(next_truck);
                current_weight += next_truck;
                idx++;
            } else {
                bridge.offer(0);
            }
            answer++;
        }

        return answer + bridge_length;
    }
}
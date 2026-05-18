import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Arrays.sort(weights);
        Map<Double, Integer> map = new HashMap<>();

        for (int weight : weights) {
            double w = (double) weight;
            
            if (map.containsKey(w)) answer += map.get(w);
            if (map.containsKey(w * 2.0 / 3.0)) answer += map.get(w * 2.0 / 3.0);
            if (map.containsKey(w * 2.0 / 4.0)) answer += map.get(w * 2.0 / 4.0);
            if (map.containsKey(w * 3.0 / 4.0)) answer += map.get(w * 3.0 / 4.0);

            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        return answer;
    }
}
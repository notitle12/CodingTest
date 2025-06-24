import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] sides) {
        Integer[] boxed = Arrays.stream(sides).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, Collections.reverseOrder());
        int answer = 2;
        if(boxed[0] < boxed[1] + boxed[2]) {
            answer = 1;
        }
        return answer;
    }
}
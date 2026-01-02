import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist)
                .boxed()
                .sorted((a, b) -> {
                    int distA = Math.abs(a - n);
                    int distB = Math.abs(b - n);

                    if (distA == distB) {
                        return b - a;
                    }
                    return distA - distB;
                })
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

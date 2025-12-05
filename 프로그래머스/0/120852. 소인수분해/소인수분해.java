import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n) {
        Set<Integer> factors = new LinkedHashSet<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        return factors.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
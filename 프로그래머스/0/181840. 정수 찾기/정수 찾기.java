import java.util.*;

class Solution {
    public int solution(int[] num_list, int n) {
        boolean isExist = Arrays.stream(num_list)
                                .anyMatch(num -> num == n);
        return isExist ? 1 : 0;
    }
}
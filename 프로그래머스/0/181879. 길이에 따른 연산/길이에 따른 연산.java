import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int len = num_list.length;
        int sum = 1;
        if(len > 10) {
            return Arrays.stream(num_list).sum();
        } else {
            for(int i = 0; i < len; i++) {
                sum *= num_list[i];
            }
            return sum;
        }
    }
}
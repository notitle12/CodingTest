import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int index = numbers.length - 1;
        Arrays.sort(numbers);
        
        int min_min = numbers[0] * numbers[1];
        int max_max = numbers[index] * numbers[index - 1];
        
        if(min_min < max_max) {
            return max_max;
        } else {
            return min_min;
        }
    }
}
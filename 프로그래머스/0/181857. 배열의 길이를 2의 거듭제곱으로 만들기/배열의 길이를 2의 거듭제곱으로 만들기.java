import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int targetLength = 1;
        
        while (targetLength < length) {
            targetLength *= 2;
        }
    
        return Arrays.copyOf(arr, targetLength);
    }
}
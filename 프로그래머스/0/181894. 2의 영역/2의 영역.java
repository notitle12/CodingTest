import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int firstIdx = -1;
        int lastIdx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                firstIdx = i;
                break;
            }
        }

        if (firstIdx == -1) {
            return new int[]{-1};
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                lastIdx = i;
                break;
            }
        }

        return Arrays.copyOfRange(arr, firstIdx, lastIdx + 1);
    }
}
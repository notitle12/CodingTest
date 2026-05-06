import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        
        int aIdx = 0;
        int bIdx = 0;
        int score = 0;
        
        while (bIdx < B.length) {
            if (B[bIdx] > A[aIdx]) {
                score++;
                aIdx++;
            }
            bIdx++;
        }
        
        return score;
    }
}
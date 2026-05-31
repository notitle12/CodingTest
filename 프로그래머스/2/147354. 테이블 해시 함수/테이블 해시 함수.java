import java.util.Arrays;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        final int targetCol = col - 1;
        
        Arrays.sort(data, (o1, o2) -> {
            if (o1[targetCol] == o2[targetCol]) {
                return Integer.compare(o2[0], o1[0]);
            }
            return Integer.compare(o1[targetCol], o2[targetCol]);
        });
        
        int answer = 0;
        
        for (int i = row_begin; i <= row_end; i++) {
            int[] row = data[i - 1];
            int s_i = 0;
            
            for (int val : row) {
                s_i += (val % i);
            }
            
            answer ^= s_i;
        }
        
        return answer;
    }
}
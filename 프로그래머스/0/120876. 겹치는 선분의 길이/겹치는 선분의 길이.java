class Solution {
    public int solution(int[][] lines) {
        int[] rail = new int[200];
        
        for (int[] line : lines) {
            int start = line[0] + 100;
            int end = line[1] + 100;
            
            for (int k = start; k < end; k++) {
                rail[k]++;
            }
        }

        int answer = 0;
        for (int count : rail) {
            if (count >= 2) {
                answer++;
            }
        }
        return answer;
    }
}
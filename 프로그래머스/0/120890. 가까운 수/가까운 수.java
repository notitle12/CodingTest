class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int minDiff = Math.abs(n - array[0]); 

        for (int i = 1; i < array.length; i++) {
            int currentDiff = Math.abs(n - array[i]);

            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                answer = array[i];
            }
            
            else if (currentDiff == minDiff) {
                if (array[i] < answer) {
                    answer = array[i];
                }
            }
        }
        return answer;
    }
}
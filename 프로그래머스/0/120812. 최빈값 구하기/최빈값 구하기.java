class Solution {
    public int solution(int[] array) {
        int[] counts = new int[1000];
        int maxCount = 0;
        int answer = 0;

        for (int num : array) {
            counts[num]++;
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                answer = i;
            } else if (counts[i] == maxCount) {
                answer = -1;
            }
        }

        return answer;
    }
}
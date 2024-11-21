class Solution {
    public int solution(int[] array) {
        int[] counts = new int[1000];
        int maxCount = 0;
        int mode = -1;
        boolean isUnique = true;
        
        for (int num : array) {
            counts[num]++;
            maxCount = Math.max(maxCount, counts[num]);
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == maxCount) {
                if (mode == -1) {
                    mode = i;
                } else {
                    isUnique = false;
                    break;
                }
            }
        }

        return isUnique ? mode : -1;
    }
}
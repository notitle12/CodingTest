class Solution {
    public int solution(String[] strArr) {
        int[] count = new int[31];
        for (String str : strArr) {
            count[str.length()]++;
        }
        
        int answer = 0;
        for (int num : count) {
            if (num > answer) {
                answer = num;
            }
        }
        return answer;
    }
}
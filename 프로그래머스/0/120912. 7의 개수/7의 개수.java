class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int num : array) {
            String strNum = Integer.toString(num);
            
            for (int i = 0; i < strNum.length(); i++) {
                if (strNum.charAt(i) == '7') {
                    answer++;
                }
            }
        }
        return answer;
    }
}
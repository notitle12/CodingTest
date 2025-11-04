class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char ch = (char) (k + '0');

        for (int num = i; num <= j; num++) {
            String str = String.valueOf(num);
            for (int c = 0; c < str.length(); c++) {      
                if (str.charAt(c) == ch) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
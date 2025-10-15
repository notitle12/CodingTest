class Solution {
    public int solution(int num, int k) {
        String numToStr = String.valueOf(num);
        char kToStr = (char)(k + '0');
        char[] ch = numToStr.toCharArray();
        int answer = -1;
        
        for(int i = 0; i < numToStr.length(); i++) {
            if(ch[i] == kToStr) {
                return i + 1;
            }
        }
        
        return answer;
    }
}
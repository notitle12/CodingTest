class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] ch = s.toCharArray();
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = -1;
        }
        
        for(int i = 0; i < s.length(); i++) {
            for(int j = i+1; j < s.length(); j++) {
                if(ch[i] == ch[j]) {
                    answer[j] = j - i;
                    continue;
                }
            }
        }
        return answer;
    }
}
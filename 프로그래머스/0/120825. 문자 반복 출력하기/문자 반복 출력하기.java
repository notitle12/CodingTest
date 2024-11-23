class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] charArray = my_string.toCharArray();
        char[] answer_charArray = new char[charArray.length * n];
        int index = 0;
        
        for(int i = 0; i < charArray.length; i++) {
            for(int j = 0; j < n; j++) {
                answer_charArray[index++] = charArray[i];
            }
            answer = String.valueOf(answer_charArray);
        }
        return answer;
    }
}
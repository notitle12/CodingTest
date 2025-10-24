class Solution {
    public String solution(String myString) {
        String str = myString.toLowerCase();
        String answer = str.replaceAll("a", "A");
        return answer;
    }
}
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for (String str : sp) {
            answer.append(flag ? str.toUpperCase() : str);
            flag = str.equals(" ");
        }

        return answer.toString();
    }
}
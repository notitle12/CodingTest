class Solution {
    public String solution(String s) {
        int[] alp = new int[26];

        for (char c : s.toCharArray()) {
            alp[c - 'a']++;
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (alp[i] == 1) {
                answer.append((char) (i + 'a'));
            }
        }

        return answer.toString();
    }
}
class Solution {
    public String solution(String s, int n) {
        n = ((n % 26) + 26) % 26;

        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                ch[i] = ' ';
            } else if (c >= 'A' && c <= 'Z') {
                ch[i] = (char) ('A' + (c - 'A' + n) % 26);
            } else if (c >= 'a' && c <= 'z') {
                ch[i] = (char) ('a' + (c - 'a' + n) % 26);
            } else {
                ch[i] = c;
            }
        }
        return new String(ch);
    }
}
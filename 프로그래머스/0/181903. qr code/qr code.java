class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        char[] ch = code.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if(i % q == r) {
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}
class Solution {
    public int solution(String t, String p) {
        int p_len = p.length();
        int range = t.length() - p.length() + 1;
        String s = "";
        int count = 0;
        for(int i = 0; i < range; i++) {
            s = t.substring(i, i + p_len);
            if(Long.parseLong(s) <= Long.parseLong(p)) {
                count++;
            }
        }
        return count;
    }
}
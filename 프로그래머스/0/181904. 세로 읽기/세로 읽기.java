class Solution {
    public String solution(String my_string, int m, int c) {
        char[] ch = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i = c; i <= my_string.length(); i += m ) {
            sb.append(ch[i-1]);
        }
        return sb.toString();
    }
}
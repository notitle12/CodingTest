class Solution {
    public String solution(String my_string) {
        char[] my_string_char = my_string.toCharArray();
        char[] invert_char = new char[my_string.length()];
        for(int i = 0; i < my_string.length(); i++) {
            invert_char[i] = my_string_char[my_string.length() - i - 1];
        }
        String answer = new String(invert_char);
        return answer;
    }
}
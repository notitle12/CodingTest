class Solution {
    public int solution(String my_string) {
        String num_str = my_string.replaceAll("[a-zA-Z]", "");
        char[] ch = num_str.toCharArray();
        int sum = 0;
        for(int i = 0; i < ch.length; i++) {
            sum += ch[i] - '0';
        }
        return sum;
    }
}
class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string);
        String subString = my_string.substring(s, e + 1);
        String reversedSubString = new StringBuilder(subString).reverse().toString();
        
        sb.delete(s, e + 1);
        sb.insert(s, reversedSubString);
        
        return sb.toString();
    }
}
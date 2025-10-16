class Solution {
    public int solution(String my_string, String is_prefix) {
        int index = is_prefix.length();
        
        if(my_string.length() < index) {
            return 0;
        }
            
        if(my_string.substring(0, index).equals(is_prefix)) {
            return 1;
        }
        
        return 0;
    }
}
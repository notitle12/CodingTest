import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] str_list = new String[my_string.length()];
        char[] ch = my_string.toCharArray();
        
        
        for(int i = 0; i < my_string.length(); i++) {
            str_list[i] = my_string.substring(i, my_string.length());
        }
        
        Arrays.sort(str_list);
        
        return str_list;
    }
}
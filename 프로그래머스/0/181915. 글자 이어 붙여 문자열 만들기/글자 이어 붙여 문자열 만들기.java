import java.util.*;

class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        char[] ch = my_string.toCharArray();
        int len = index_list.length;
        
        // Arrays.sort(index_list);
        for(int i = 0; i < len; i++) {
            sb.append(ch[index_list[i]]);
        }
        
        return sb.toString();
    }
}
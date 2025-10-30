import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
Set<Integer> indicesSet = new HashSet<>();
        for (int index : indices) {
            indicesSet.add(index);
        }

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            if (!indicesSet.contains(i)) {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}
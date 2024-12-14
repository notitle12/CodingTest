import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String[] s1, String[] s2) {

        Set<String> set = new HashSet<>();
        for (String str : s1) {
            set.add(str);
        }

        int count = 0;
        for (String str : s2) {
            if (set.contains(str)) {
                count++;
            }
        }

        return count;
    }
}
import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();

        for (String row : picture) {
            StringBuilder sb = new StringBuilder();
            
            for (char c : row.toCharArray()) {
                for (int i = 0; i < k; i++) {
                    sb.append(c);
                }
            }
            
            String expandedRow = sb.toString();

            for (int i = 0; i < k; i++) {
                answer.add(expandedRow);
            }
        }

        return answer.toArray(new String[0]);
    }
}
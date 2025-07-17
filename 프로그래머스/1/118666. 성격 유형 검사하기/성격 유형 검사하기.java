import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        char[] types1 = {'R', 'C', 'J', 'A'};
        char[] types2 = {'T', 'F', 'M', 'N'};
        
        Map<Character, Integer> scores = new HashMap<>();
        for(char c : "RTCFJMAN".toCharArray()) {
            scores.put(c, 0);
        }
        
        for (int i = 0; i < survey.length; i++) {
            String s = survey[i];
            int choice = choices[i];
            
            if (choice == 4) continue;
            
            int score = 0;
            if (choice < 4) {
                score = 4 - choice;
                char disagreeType = s.charAt(0);
                scores.put(disagreeType, scores.get(disagreeType) + score);
            } else {
                score = choice - 4;
                char agreeType = s.charAt(1);
                scores.put(agreeType, scores.get(agreeType) + score);
            }
        }
        
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < 4; i++) {
            char t1 = types1[i];
            char t2 = types2[i];
            int score1 = scores.get(t1);
            int score2 = scores.get(t2);
            
            if (score1 >= score2) {
                answer.append(t1);
            } else {
                answer.append(t2);
            }
        }
        
        return answer.toString();
    }
}
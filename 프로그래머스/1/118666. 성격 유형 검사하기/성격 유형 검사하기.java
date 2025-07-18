import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> scores = new HashMap<>();
        for (char c : "RTCFJMAN".toCharArray())
            scores.put(c, 0);

        for (int i = 0; i < survey.length; i++) {
            String s = survey[i];
            int choice = choices[i];

            if (choice == 4) continue;
            int score = Math.abs(choice - 4);

            if (choice < 4) {
                char c = s.charAt(0);
                scores.put(c, scores.get(c) + score);
            } else {
                char c = s.charAt(1);
                scores.put(c, scores.get(c) + score);
            }
        }

        char[][] types = {{'R','T'}, {'C','F'}, {'J','M'}, {'A','N'}};
        StringBuilder result = new StringBuilder();

        for (char[] pair : types) {
            char left = pair[0], right = pair[1];
            int leftScore = scores.get(left);
            int rightScore = scores.get(right);

            if (leftScore >= rightScore)
                result.append(left);
            else
                result.append(right);
        }
        return result.toString();
    }
}
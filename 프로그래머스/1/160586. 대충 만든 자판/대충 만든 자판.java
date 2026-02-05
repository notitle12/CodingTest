import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> minKeys = new HashMap<>();

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                int count = i + 1;
                minKeys.put(c, Math.min(minKeys.getOrDefault(c, Integer.MAX_VALUE), count));
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int totalPress = 0;
            boolean possible = true;
            
            for (char targetChar : targets[i].toCharArray()) {
                if (minKeys.containsKey(targetChar)) {
                    totalPress += minKeys.get(targetChar);
                } else {
                    possible = false;
                    break;
                }
            }
            answer[i] = possible ? totalPress : -1;
        }

        return answer;
    }
}
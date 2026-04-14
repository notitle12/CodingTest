import java.util.*;

class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> dictionary = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            dictionary.put(String.valueOf((char) ('A' + i)), i + 1);
        }

        List<Integer> result = new ArrayList<>();
        int dictSize = 27;

        for (int i = 0; i < msg.length(); ) {
            String w = "";
            int nextIdx = i;

            while (nextIdx < msg.length()) {
                String nextW = w + msg.charAt(nextIdx);
                if (dictionary.containsKey(nextW)) {
                    w = nextW;
                    nextIdx++;
                } else {
                    break;
                }
            }

            result.add(dictionary.get(w));
            i += w.length();

            if (nextIdx < msg.length()) {
                dictionary.put(w + msg.charAt(nextIdx), dictSize++);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
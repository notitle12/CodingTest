import java.util.*;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        int answer = 0;
        String[] words = message.split(" ");
        int n = words.length;
        int[] startIndices = new int[n];
        
        int currentPos = 0;
        for (int i = 0; i < n; i++) {
            startIndices[i] = currentPos;
            currentPos += words[i].length() + 1;
        }

        boolean[] isSpoilerWord = new boolean[n];
        for (int i = 0; i < n; i++) {
            int wordStart = startIndices[i];
            int wordEnd = wordStart + words[i].length() - 1;

            for (int[] range : spoiler_ranges) {
                if (!(wordEnd < range[0] || wordStart > range[1])) {
                    isSpoilerWord[i] = true;
                    break;
                }
            }
        }

        Set<String> nonSpoilerWords = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (!isSpoilerWord[i]) {
                nonSpoilerWords.add(words[i]);
            }
        }

        Set<String> revealedSpoilerWords = new HashSet<>();
        boolean[] processed = new boolean[n];

        for (int[] range : spoiler_ranges) {
            int rangeStart = range[0];
            int rangeEnd = range[1];

            for (int i = 0; i < n; i++) {
                if (processed[i]) continue;

                int wordStart = startIndices[i];
                int wordEnd = wordStart + words[i].length() - 1;

                if (!(wordEnd < rangeStart || wordStart > rangeEnd)) {
                    String currentWord = words[i];
                    
                    if (!nonSpoilerWords.contains(currentWord) && !revealedSpoilerWords.contains(currentWord)) {
                        answer++;
                    }
                    revealedSpoilerWords.add(currentWord);
                    processed[i] = true;
                }
            }
        }

        return answer;
    }
}
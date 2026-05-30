import java.util.*;

class Solution {
    public String solution(String m, String[] musicinfos) {
        m = replaceSharp(m);
        String answer = "(None)";
        int maxTime = -1;

        for (String info : musicinfos) {
            String[] parts = info.split(",");
            int playTime = getPlayTime(parts[0], parts[1]);
            String title = parts[2];
            String melody = replaceSharp(parts[3]);

            StringBuilder fullMelody = new StringBuilder();
            for (int i = 0; i < playTime; i++) {
                fullMelody.append(melody.charAt(i % melody.length()));
            }

            if (fullMelody.toString().contains(m)) {
                if (playTime > maxTime) {
                    maxTime = playTime;
                    answer = title;
                }
            }
        }
        return answer;
    }

    private String replaceSharp(String m) {
        return m.replace("C#", "c").replace("D#", "d")
                .replace("F#", "f").replace("G#", "g").replace("A#", "a");
    }

    private int getPlayTime(String start, String end) {
        String[] s = start.split(":");
        String[] e = end.split(":");
        return (Integer.parseInt(e[0]) * 60 + Integer.parseInt(e[1])) - 
               (Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]));
    }
}
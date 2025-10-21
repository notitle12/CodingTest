import java.util.*;

class Solution {
    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        String[] Codes = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        
        Map<String, String> map = new HashMap<>();
        
        for (int i = 0; i < Codes.length; i++) {
            String en = String.valueOf((char) ('a' + i));

            map.put(Codes[i], en);
        }
        
        String[] morseArray = letter.split(" ");
        
        for (String Code : morseArray) {
            answer.append(map.get(Code));
        }
        
        return answer.toString();
    }
}
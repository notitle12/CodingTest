class Solution {
    public String solution(String letter) {
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        StringBuilder answer = new StringBuilder();
        
        for (String morseCode : letter.split(" ")) {
            for (int i = 0; i < morse.length; i++) {
                if (morse[i].equals(morseCode)) {
                    answer.append(alphabet[i]);
                    break;
                }
            }
        }
        
        return answer.toString();
    }
}
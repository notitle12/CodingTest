class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];
        int round = -1;
        
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            if (Character.isDigit(c)) {
                round++;
                if (c == '1' && dartResult.charAt(i + 1) == '0') {
                    scores[round] = 10;
                    i++;
                } else {
                    scores[round] = c - '0';
                }
            } else if (c == 'S' || c == 'D' || c == 'T') {
                if (c == 'D') scores[round] = (int) Math.pow(scores[round], 2);
                else if (c == 'T') scores[round] = (int) Math.pow(scores[round], 3);
            } else if (c == '*') {
                scores[round] *= 2;
                if (round > 0) scores[round - 1] *= 2;
            } else if (c == '#') {
                scores[round] *= -1;
            }
        }
        
        return scores[0] + scores[1] + scores[2];
    }
}
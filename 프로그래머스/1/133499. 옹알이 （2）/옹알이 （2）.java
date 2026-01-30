class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] speaks = {"aya", "ye", "woo", "ma"};

        for (String str : babbling) {
            boolean isPossible = true;
            for (String speak : speaks) {
                if (str.contains(speak.repeat(2))) {
                    isPossible = false;
                    break;
                }
            }

            if (!isPossible) continue;

            for (String speak : speaks) {
                str = str.replace(speak, " ");
            }

            if (str.trim().isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}
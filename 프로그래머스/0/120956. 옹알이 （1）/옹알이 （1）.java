class Solution {
    public int solution(String[] babbling) {
        String[] allowed = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String word : babbling) {
            String temp = word;
            for (String s : allowed) {
                temp = temp.replace(s, " ");
            }

            if (temp.trim().isEmpty()) {
                boolean hasDuplicate = false;
                for (String s : allowed) {
                    if (word.indexOf(s) != word.lastIndexOf(s)) {
                        hasDuplicate = true;
                        break;
                    }
                }
                if (!hasDuplicate) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
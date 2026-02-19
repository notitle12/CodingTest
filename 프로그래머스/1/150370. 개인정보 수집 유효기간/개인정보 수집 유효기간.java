import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> termMap = new HashMap<>();

        int todayTotalDays = getTotalDays(today);

        for (String term : terms) {
            String[] s = term.split(" ");
            termMap.put(s[0], Integer.parseInt(s[1]) * 28);
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] s = privacies[i].split(" ");
            int privacyDays = getTotalDays(s[0]);
            String termType = s[1];

            if (privacyDays + termMap.get(termType) <= todayTotalDays) {
                answer.add(i + 1);
            }
        }

        int[] result = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }

    private int getTotalDays(String date) {
        String[] s = date.split("\\.");
        int year = Integer.parseInt(s[0]);
        int month = Integer.parseInt(s[1]);
        int day = Integer.parseInt(s[2]);

        return (year * 12 * 28) + (month * 28) + day;
    }
}
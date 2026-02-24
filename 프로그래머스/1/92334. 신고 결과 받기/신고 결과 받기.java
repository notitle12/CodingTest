import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> reportMap = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();

        for (String id : id_list) {
            reportMap.put(id, new HashSet<>());
            countMap.put(id, 0);
        }

        for (String r : report) {
            String[] s = r.split(" ");
            String reporter = s[0];
            String reported = s[1];

            if (reportMap.get(reporter).add(reported)) {
                countMap.put(reported, countMap.get(reported) + 1);
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            String reporter = id_list[i];
            HashSet<String> myReports = reportMap.get(reporter);

            for (String reported : myReports) {
                if (countMap.get(reported) >= k) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }
}
import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> userMap = new HashMap<>();
        int messageCount = 0;

        for (String r : record) {
            String[] parts = r.split(" ");
            if (parts[0].equals("Enter") || parts[0].equals("Change")) {
                userMap.put(parts[1], parts[2]);
            }
            if (parts[0].equals("Enter") || parts[0].equals("Leave")) {
                messageCount++;
            }
        }

        String[] answer = new String[messageCount];
        int idx = 0;

        for (String r : record) {
            String[] parts = r.split(" ");
            String nickname = userMap.get(parts[1]);

            if (parts[0].equals("Enter")) {
                answer[idx++] = nickname + "님이 들어왔습니다.";
            } else if (parts[0].equals("Leave")) {
                answer[idx++] = nickname + "님이 나갔습니다.";
            }
        }

        return answer;
    }
}
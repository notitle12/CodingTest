import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int currentActiveServers = 0;
        Queue<int[]> serverExpiryQueue = new LinkedList<>();

        for (int hour = 0; hour < 24; hour++) {
            if (!serverExpiryQueue.isEmpty() && serverExpiryQueue.peek()[0] == hour) {
                currentActiveServers -= serverExpiryQueue.poll()[1];
            }

            int requiredServers = players[hour] / m;

            if (currentActiveServers < requiredServers) {
                int additionalServersNeeded = requiredServers - currentActiveServers;
                answer += additionalServersNeeded;
                currentActiveServers += additionalServersNeeded;
                serverExpiryQueue.offer(new int[]{hour + k, additionalServersNeeded});
            }
        }

        return answer;
    }
}
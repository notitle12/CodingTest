import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;

        int answer = 0;
        LinkedList<String> cache = new LinkedList<>();

        for (String city : cities) {
            String s = city.toLowerCase();

            if (cache.remove(s)) {
                answer += 1;
                cache.addFirst(s);
            } else {
                answer += 5;
                if (cache.size() >= cacheSize) {
                    cache.removeLast();
                }
                cache.addFirst(s);
            }
        }

        return answer;
    }
}
import java.util.*;

class Solution {
    private Map<String, Integer> map;

    public String[] solution(String[] orders, int[] course) {
        List<String> result = new ArrayList<>();

        for (int c : course) {
            map = new HashMap<>();
            int maxCount = 0;

            for (String order : orders) {
                char[] arr = order.toCharArray();
                Arrays.sort(arr);
                combination(arr, new StringBuilder(), 0, c);
            }

            for (int count : map.values()) {
                maxCount = Math.max(maxCount, count);
            }

            if (maxCount >= 2) {
                for (String key : map.keySet()) {
                    if (map.get(key) == maxCount) {
                        result.add(key);
                    }
                }
            }
        }

        Collections.sort(result);
        return result.toArray(new String[0]);
    }

    private void combination(char[] order, StringBuilder sb, int index, int count) {
        if (sb.length() == count) {
            String menu = sb.toString();
            map.put(menu, map.getOrDefault(menu, 0) + 1);
            return;
        }

        for (int i = index; i < order.length; i++) {
            sb.append(order[i]);
            combination(order, sb, i + 1, count);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (isZeroFive(i)) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean isZeroFive(int num) {
        String s = String.valueOf(num);
        for (char c : s.toCharArray()) {
            if (c != '0' && c != '5') {
                return false;
            }
        }
        return true;
    }
}
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> intList = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (intList.isEmpty()) {
                intList.add(arr[i]);
                i++;
            } else if (intList.get(intList.size() - 1) < arr[i]) {
                intList.add(arr[i]);
                i++;
            } else {
                intList.remove(intList.size() - 1);
            }
        }

        return intList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
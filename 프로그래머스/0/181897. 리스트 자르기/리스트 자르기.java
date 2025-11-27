import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        int start = 0;
        int end = num_list.length - 1;
        int step = 1;

        switch (n) {
            case 1 -> end = b;
            case 2 -> start = a;
            case 3 -> {
                start = a;
                end = b;
            }
            case 4 -> {
                start = a;
                end = b;
                step = c;
            }
        }

        List<Integer> resultList = new ArrayList<>();
        for (int i = start; i <= end; i += step) {
            resultList.add(num_list[i]);
        }

        return resultList.stream().mapToInt(i -> i).toArray();
    }
}
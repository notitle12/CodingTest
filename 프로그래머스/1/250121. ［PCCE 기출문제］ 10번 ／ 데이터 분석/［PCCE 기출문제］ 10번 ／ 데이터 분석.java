import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> columnMap = new HashMap<>();
        columnMap.put("code", 0);
        columnMap.put("date", 1);
        columnMap.put("maximum", 2);
        columnMap.put("remain", 3);

        int extIdx = columnMap.get(ext);
        int sortIdx = columnMap.get(sort_by);

        return Arrays.stream(data)
                .filter(row -> row[extIdx] < val_ext)
                .sorted(Comparator.comparingInt(row -> row[sortIdx]))
                .toArray(int[][]::new);
    }
}
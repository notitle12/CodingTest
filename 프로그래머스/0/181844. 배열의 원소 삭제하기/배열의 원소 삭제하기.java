import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> deleteSet = Arrays.stream(delete_list).boxed().collect(Collectors.toSet());
        
        List<Integer> resultList = new ArrayList<>();
        
        for (int num : arr) {
            if (!deleteSet.contains(num)) {
                resultList.add(num);
            }
        }
        
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}
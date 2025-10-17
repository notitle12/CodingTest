import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for(int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            arrayList.add(arr[i]);
        }
        
        
        for(int j = intervals[1][0]; j <= intervals[1][1]; j++) {
            arrayList.add(arr[j]);
        }
        
        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                arrayList.add(arr[i]);
            }
        }
        
        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}
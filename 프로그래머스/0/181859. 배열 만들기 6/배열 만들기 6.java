import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty()) {
                stk.push(arr[i]);
            } 
            else if (stk.peek() == arr[i]) {
                stk.pop();
            } 
            else {
                stk.push(arr[i]);
            }
        }
        
        if (stk.isEmpty()) {
            return new int[]{-1};
        } else {
            return stk.stream().mapToInt(i -> i).toArray();
        }
    }
}
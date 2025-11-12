import java.util.*;

class Solution {
    public int solution(String s) {
        String[] parts = s.split(" ");
        int sum = 0;
        int lastAddedNum = 0;
        
        for (String part : parts) {
            if (part.equals("Z")) {
                sum -= lastAddedNum;
            } else {
                int currentNum = Integer.parseInt(part);
                sum += currentNum;
                lastAddedNum = currentNum;
            }
        }
        return sum;
    }
}
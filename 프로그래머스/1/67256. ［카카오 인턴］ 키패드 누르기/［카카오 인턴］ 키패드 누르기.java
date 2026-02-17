import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int left = 10; 
        int right = 12; 

        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                answer.append("L");
                left = num;
            } else if (num == 3 || num == 6 || num == 9) {
                answer.append("R");
                right = num;
            } else {
                if (num == 0) num = 11;
                
                int leftDist = getDistance(left, num);
                int rightDist = getDistance(right, num);

                if (leftDist < rightDist) {
                    answer.append("L");
                    left = num;
                } else if (rightDist < leftDist) {
                    answer.append("R");
                    right = num;
                } else {
                    if (hand.equals("left")) {
                        answer.append("L");
                        left = num;
                    } else {
                        answer.append("R");
                        right = num;
                    }
                }
            }
        }
        return answer.toString();
    }

    private int getDistance(int pos, int target) {
        int posIdx = pos - 1;
        int targetIdx = target - 1;

        int posRow = posIdx / 3;
        int posCol = posIdx % 3;
        int targetRow = targetIdx / 3;
        int targetCol = targetIdx % 3;

        return Math.abs(posRow - targetRow) + Math.abs(posCol - targetCol);
    }
}
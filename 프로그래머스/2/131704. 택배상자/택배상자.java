import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> assistBelt = new Stack<>();
        int currentBox = 1;
        int index = 0;

        while (index < order.length) {
            if (currentBox <= order.length && currentBox == order[index]) {
                answer++;
                currentBox++;
                index++;
            } else if (!assistBelt.isEmpty() && assistBelt.peek() == order[index]) {
                assistBelt.pop();
                answer++;
                index++;
            } else if (currentBox <= order.length) {
                assistBelt.push(currentBox);
                currentBox++;
            } else {
                break;
            }
        }

        return answer;
    }
}
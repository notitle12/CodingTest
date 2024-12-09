import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Integer[] numbersBoxed = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(numbersBoxed, (a, b) -> b - a);
        int answer = numbersBoxed[0] * numbersBoxed[1];
        return answer;
    }
}

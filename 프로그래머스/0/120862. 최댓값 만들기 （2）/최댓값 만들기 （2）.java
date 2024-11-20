class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        int length = numbers.length;
        for(int i = 0; i < length - 1; i++) {
            for(int j = i + 1; j < length; j++) {
                if(numbers[i] * numbers[j] > max)
                max = numbers[i] * numbers[j];
                answer = max;
            }
        }
        return answer;
    }
}
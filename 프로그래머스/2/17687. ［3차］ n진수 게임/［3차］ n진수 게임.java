class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder allNumbers = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        int currentNum = 0;

        while (allNumbers.length() < t * m) {
            allNumbers.append(Integer.toString(currentNum++, n).toUpperCase());
        }

        for (int i = 0; i < t; i++) {
            answer.append(allNumbers.charAt((i * m) + (p - 1)));
        }

        return answer.toString();
    }
}
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {0, 1};
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = (denom1 * denom2);
        int x = 1;

        for (int i = 1; i <= Math.min(numer, denom); i++) {
            if (numer % i == 0 && denom % i == 0) {
                x = i;
            }
        }
        answer[0] = numer / x;
        answer[1] = denom / x;
        return answer;
    }
}
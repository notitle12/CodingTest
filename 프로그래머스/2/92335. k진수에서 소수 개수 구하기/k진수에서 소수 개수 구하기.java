import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String converted = Integer.toString(n, k);
        String[] splitNums = converted.split("0+");

        for (String s : splitNums) {
            if (isPrime(Long.parseLong(s))) {
                answer++;
            }
        }
        return answer;
    }

    private boolean isPrime(long num) {
        if (num < 2) return false;
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
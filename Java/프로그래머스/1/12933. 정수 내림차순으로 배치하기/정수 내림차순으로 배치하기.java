import java.util.Arrays;

class Solution {
    public long solution(long n) {
        int length = String.valueOf(n).length();
        long[] temp = new long[length];

        for (int i = length - 1; i >= 0; i--) {
            temp[i] = n % 10;
            n /= 10;
        }

        Arrays.sort(temp);

 
        for (int i = 0; i < length / 2; i++) {
            long longTemp = temp[i];
            temp[i] = temp[length - 1 - i];
            temp[length - 1 - i] = longTemp;
        }

        long answer = 0;
        for (int i = 0; i < length; i++) {
            answer = answer * 10 + temp[i];
        }

        return answer;
    }
}
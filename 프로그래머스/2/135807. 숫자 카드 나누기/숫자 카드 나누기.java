public class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int gcdA = arrayA[0];
        int gcdB = arrayB[0];

        for (int i = 1; i < arrayA.length; i++) {
            gcdA = getGcd(gcdA, arrayA[i]);
            gcdB = getGcd(gcdB, arrayB[i]);
        }

        int answerA = check(gcdA, arrayB) ? gcdA : 0;
        int answerB = check(gcdB, arrayA) ? gcdB : 0;

        return Math.max(answerA, answerB);
    }

    private int getGcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    private boolean check(int gcd, int[] array) {
        for (int num : array) {
            if (num % gcd == 0) return false;
        }
        return true;
    }
}
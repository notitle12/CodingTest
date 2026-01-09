class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int top = numer1 * denom2 + numer2 * denom1;
        int bottom = denom1 * denom2;

        int gcd = getGcd(top, bottom);

        return new int[]{top / gcd, bottom / gcd};
    }

    private int getGcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
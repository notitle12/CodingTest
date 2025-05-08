class Solution {
    public int solution(int a, int b) {
        String concat = String.valueOf(a) + b;
        int abValue = Integer.parseInt(concat);
        int doubledProduct = 2 * a * b;
        return Math.max(abValue, doubledProduct);
    }
}
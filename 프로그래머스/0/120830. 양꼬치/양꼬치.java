class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int meat_price = n * 12000;
        int drink_price = k * 2000;
        int discount_price = 2000 * (n / 10);
        int total = meat_price + drink_price - discount_price;
        answer = total;
        return answer;
    }
}
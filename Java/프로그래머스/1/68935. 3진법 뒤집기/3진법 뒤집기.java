class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        while(n > 0) {
            str = (n % 3) + str;
            n = n / 3;
        }
    
        String reversed = new StringBuilder(str).reverse().toString();
        
        int power = 1;
        for (int i = reversed.length() - 1; i >= 0; i--) {
            int digit = reversed.charAt(i) - '0';
            answer += digit * power;
            power *= 3;
        }
        
        return answer;
    }
}
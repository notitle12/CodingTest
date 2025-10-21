class Solution {
    public int solution(int n) {
        int i = 1;
        int multi = 1;
        
        while (multi <= n) {
            i++;
            multi *= i;
        }
        
        return i-1;
    }
}
class Solution {
    public int solution(String number) {
        char[] ch = number.toCharArray();
        int sum = 0;
        
        for(int i = 0; i < number.length(); i++) {
            sum += (int)(ch[i] - '0');
        }
        
        return sum % 9;
    }
}
class Solution {
    public int solution(int order) {
        String num = String.valueOf(order);
        char[] ch = num.toCharArray();
        int count = 0;
        
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == '3' || ch[i] == '6' || ch[i] == '9') {
                count++;
            }
        }
        
        return count;
    }
}
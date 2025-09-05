class Solution {
    public String solution(int[] food) {
        int[] temp = new int[food.length];
        String answer = "";
        String s = "";
        for(int i = 0; i < food.length; i++) {
            temp[i] = food[i] / 2;
        }
        
        for(int j = 1; j < temp.length; j++) {
            String num = j + "";
            if(temp[j] > 0) {
                answer = answer + num.repeat(temp[j]);
            }
        }
        
        String reversed = new StringBuilder(answer).reverse().toString();
        
        answer = answer + "0" + reversed;
            
        return answer;
    }
}
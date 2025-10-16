class Solution {
    public int solution(String binomial) {
        String[] math = binomial.split(" ");
        int st = Integer.parseInt(math[0]);
        int nd = Integer.parseInt(math[2]);
        int answer = 0;
        
        if(math[1].equals("+")) {
            answer = st + nd;
        } else if (math[1].equals("-")) {
            answer = st - nd;
        } else {
            answer = st * nd;
        }
        return answer;
    }
}
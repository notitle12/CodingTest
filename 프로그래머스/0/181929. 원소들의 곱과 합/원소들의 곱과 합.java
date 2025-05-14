class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multi = 1;
        int sum = 0;
        for(int i = 0; i < num_list.length; i++) {
            multi *= num_list[i];
            sum += num_list[i];
        }
        if(multi < sum * sum) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}
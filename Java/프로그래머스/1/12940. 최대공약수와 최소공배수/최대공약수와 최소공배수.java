class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int supply_num = n * m;
        int max_num = 1;
        int min_num = m;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0 && m % i == 0) {
                max_num = i;
                answer[0] = max_num;
            }
        }
        
        for(int j = m; j <= supply_num; j++) {
            if(j % n == 0 && j % m == 0) {
                min_num = j;
                answer[1] = min_num;
                break;
            }
        }
        
        return answer;
    }
}
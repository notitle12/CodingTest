class Solution {
    public int solution(int[] sides) {
        int num_max = Math.max(sides[0], sides[1]);
        int num_min = Math.min(sides[0], sides[1]);
        
        // x가 가장 길 때 
        // num_max < x < num_max + num_min
      
        // x가 중간일 때
        // num_max < x + num_min; -> num_max - num_min < x < num_max
        
        // x가 가장 짧을 때
        // num_max < num_min + x; -> num_max - num_min < x < num_min
        
        // ex) num_max = 10, num_min = 3
        // 10 < x < 13 -> 11 12
        // 7 < x < 10 -> 8 9
        // 7 < x < 3 -> 에러
        
        // ex) num_max = 10, num_min = 7
        // 10 < x < 17
        // 3 < x < 10
        // 3 < x < 7 -> 의미가 없음
        
        // 따라서 x가 제일 클때와 중간일때만 고려
    
        int answer = (2 * num_min - 1);
        return answer;
    }
}
class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int row_count = box[0] / n;
        int col_count = box[1] / n;
        int height_count = box[2] / n;
        answer = row_count * col_count * height_count;
        return answer;
    }
}
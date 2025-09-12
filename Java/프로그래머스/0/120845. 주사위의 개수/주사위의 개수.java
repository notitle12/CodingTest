class Solution {
    public int solution(int[] box, int n) {
        int row_max = box[0] / n;
        int col_max = box[1] / n;
        int heigth_max = box[2] / n;
        int answer = row_max * col_max * heigth_max;
        return answer;
    }
}
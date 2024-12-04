class Solution {
    public int solution(int[][] dots) {
        // x와 y의 초기값 설정
        int minX = dots[0][0];
        int maxX = dots[0][0];
        int minY = dots[0][1];
        int maxY = dots[0][1];

        // dots 배열을 순회하며 비교
        for (int i = 1; i < dots.length; i++) {
            int x = dots[i][0];
            int y = dots[i][1];

            if (x < minX) {
                minX = x;
            }
            if (x > maxX) {
                maxX = x;
            }

            if (y < minY) {
                minY = y;
            }
            if (y > maxY) {
                maxY = y;
            }
        }

        int width = maxX - minX;
        int height = maxY - minY;

        return width * height;
    }
}

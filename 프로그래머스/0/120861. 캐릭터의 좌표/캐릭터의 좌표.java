class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        
        int xRange = board[0] / 2;
        int yRange = board[1] / 2;

        for (String key : keyinput) {
            switch (key) {
                case "up":
                    if (y < yRange) y++;
                    break;
                case "down":
                    if (y > -yRange) y--;
                    break;
                case "left":
                    if (x > -xRange) x--;
                    break;
                case "right":
                    if (x < xRange) x++;
                    break;
            }
        }

        return new int[]{x, y};
    }
}
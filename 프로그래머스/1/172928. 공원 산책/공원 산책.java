import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();
        int r = 0, c = 0;

        for (int i = 0; i < h; i++) {
            if (park[i].contains("S")) {
                r = i;
                c = park[i].indexOf("S");
                break;
            }
        }

        Map<String, int[]> dirMap = new HashMap<>();
        dirMap.put("N", new int[]{-1, 0});
        dirMap.put("S", new int[]{1, 0});
        dirMap.put("W", new int[]{0, -1});
        dirMap.put("E", new int[]{0, 1});

        for (String route : routes) {
            String[] s = route.split(" ");
            String op = s[0];
            int n = Integer.parseInt(s[1]);

            int[] d = dirMap.get(op);
            int nr = r;
            int nc = c;
            boolean canMove = true;

            for (int i = 0; i < n; i++) {
                nr += d[0];
                nc += d[1];

                if (nr < 0 || nr >= h || nc < 0 || nc >= w || park[nr].charAt(nc) == 'X') {
                    canMove = false;
                    break;
                }
            }

            if (canMove) {
                r = nr;
                c = nc;
            }
        }

        return new int[]{r, c};
    }
}
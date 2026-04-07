import java.util.HashSet;

class Solution {
    public int solution(String dirs) {
        HashSet<String> visitedPath = new HashSet<>();
        int x = 0;
        int y = 0;

        for (int i = 0; i < dirs.length(); i++) {
            char command = dirs.charAt(i);
            int nx = x;
            int ny = y;

            if (command == 'U' && y < 5) ny++;
            else if (command == 'D' && y > -5) ny--;
            else if (command == 'R' && x < 5) nx++;
            else if (command == 'L' && x > -5) nx--;
            else continue;

            String path1 = x + "" + y + "" + nx + "" + ny;
            String path2 = nx + "" + ny + "" + x + "" + y;

            visitedPath.add(path1);
            visitedPath.add(path2);

            x = nx;
            y = ny;
        }

        return visitedPath.size() / 2;
    }
}
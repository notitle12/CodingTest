class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        
        int targetFloor = (num - 1) / w;
        int targetPos = getPosition(num, w, targetFloor);
        
        int currentFloor = targetFloor;
        while (true) {
            int currentNum = getCurrentNum(currentFloor, targetPos, w);
            if (currentNum > n) break;
            answer++;
            currentFloor++;
        }
        
        return answer;
    }

    private int getPosition(int num, int w, int floor) {
        int mod = (num - 1) % w;
        return (floor % 2 == 0) ? mod : (w - 1 - mod);
    }

    private int getCurrentNum(int floor, int pos, int w) {
        int base = floor * w;
        if (floor % 2 == 0) {
            return base + pos + 1;
        } else {
            return base + (w - 1 - pos) + 1;
        }
    }
}
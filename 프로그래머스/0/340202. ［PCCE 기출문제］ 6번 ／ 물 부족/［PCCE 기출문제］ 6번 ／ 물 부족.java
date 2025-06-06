class Solution {
    public int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for(int i=0; i<change.length; i++){
            usage = (int)(usage * (100 + change[i]) / 100.0);
            total_usage += usage;
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }
}
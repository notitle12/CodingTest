class Solution {
    public int solution(int[] num_list) {
        int count = 0;
        int num = 0;
        for(int i = 0; i < num_list.length; i++) {
            num = num_list[i];
            while(num != 1) {
                if(num % 2 == 0) {
                    num = num / 2;
                    count++;
                } else {
                    num = (num - 1) / 2;
                    count++;
                }
            }
        }
        return count;
    }
}
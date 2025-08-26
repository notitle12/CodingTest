class Solution {
    public int solution(int[] a, int[] b) {
        int a_len = a.length;
        int[] square = new int[a_len];
        int sum = 0;
        
        // for(int i = 0; i < a_length; i++) {
        //     a[i] = Math.abs(a[i]);
        //     b[i] = Math.abs(b[i]);
        // }
        
        for(int i = 0; i < a_len; i++) {
            square[i] = a[i] * b[i];
        }
        
        for(int i = 0; i < a_len; i++) {
            sum = sum + square[i];
        }
        
        return sum;
    }
}
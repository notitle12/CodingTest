class Solution {
    public int solution(String myString, String pat) {
        String low_str = myString.toLowerCase();
        String low_pat = pat.toLowerCase();
        
        if(low_str.contains(low_pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}
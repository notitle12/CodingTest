class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();

        for (char c : myString.toCharArray()) {
            if (c == 'A') {
                sb.append('B');
            } else {
                sb.append('A');
            }
        }

        String trString = sb.toString();
        
        return trString.contains(pat) ? 1 : 0;
    }
}
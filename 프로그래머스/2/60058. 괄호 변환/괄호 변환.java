class Solution {
    public String solution(String p) {
        if (p.isEmpty()) return "";

        int index = getBalancedIndex(p);
        String u = p.substring(0, index + 1);
        String v = p.substring(index + 1);

        if (checkCorrect(u)) {
            return u + solution(v);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(solution(v));
            sb.append(")");
            
            for (int i = 1; i < u.length() - 1; i++) {
                if (u.charAt(i) == '(') {
                    sb.append(")");
                } else {
                    sb.append("(");
                }
            }
            return sb.toString();
        }
    }

    private int getBalancedIndex(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') count++;
            else count--;
            
            if (count == 0) return i;
        }
        return -1;
    }

    private boolean checkCorrect(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') count++;
            else count--;
            
            if (count < 0) return false;
        }
        return count == 0;
    }
}
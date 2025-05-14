class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        String condition = ineq + eq;

        if (condition.equals("<=")) return n <= m ? 1 : 0;
        if (condition.equals(">=")) return n >= m ? 1 : 0;
        if (condition.equals("<!")) return n <  m ? 1 : 0;
        if (condition.equals(">!")) return n >  m ? 1 : 0;

        return 0;
    }
}
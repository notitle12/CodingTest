class Solution {
    public String solution(String X, String Y) {
        int[] countX = new int[10];
        int[] countY = new int[10];

        for (String x : X.split("")) {
            countX[Integer.parseInt(x)]++;
        }
        for (String y : Y.split("")) {
            countY[Integer.parseInt(y)]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            int commonCount = Math.min(countX[i], countY[i]);
            for (int j = 0; j < commonCount; j++) {
                sb.append(i);
            }
        }

        if (sb.length() == 0) return "-1";
        if (sb.toString().startsWith("0")) return "0";

        return sb.toString();
    }
}

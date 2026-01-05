class Solution {
    public String solution(String polynomial) {
        int xCount = 0;
        int num = 0;

        String[] terms = polynomial.split(" \\+ ");

        for (String term : terms) {
            if (term.contains("x")) {
                xCount += term.equals("x") ? 1 : Integer.parseInt(term.replace("x", ""));
            } else {
                num += Integer.parseInt(term);
            }
        }

        StringBuilder sb = new StringBuilder();

        if (xCount > 0) {
            sb.append(xCount == 1 ? "x" : xCount + "x");
        }

        if (num > 0) {
            if (sb.length() > 0) {
                sb.append(" + ");
            }
            sb.append(num);
        }

        return sb.toString();
    }
}
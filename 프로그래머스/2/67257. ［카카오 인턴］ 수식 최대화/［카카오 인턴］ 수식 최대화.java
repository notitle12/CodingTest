import java.util.ArrayList;
import java.util.List;

class Solution {
    private final String[][] priorities = {
        {"+", "-", "*"}, {"+", "*", "-"},
        {"-", "+", "*"}, {"-", "*", "+"},
        {"*", "+", "-"}, {"*", "-", "+"}
    };

    public long solution(String expression) {
        long answer = 0;
        
        List<Long> numbers = new ArrayList<>();
        List<String> ops = new ArrayList<>();
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                numbers.add(Long.parseLong(sb.toString()));
                sb.setLength(0);
                ops.add(String.valueOf(c));
            } else {
                sb.append(c);
            }
        }
        numbers.add(Long.parseLong(sb.toString()));

        for (String[] priority : priorities) {
            List<Long> subNumbers = new ArrayList<>(numbers);
            List<String> subOps = new ArrayList<>(ops);
            
            for (String op : priority) {
                for (int i = 0; i < subOps.size(); i++) {
                    if (subOps.get(i).equals(op)) {
                        long n1 = subNumbers.get(i);
                        long n2 = subNumbers.get(i + 1);
                        long res = calculate(n1, n2, op);
                        
                        subNumbers.remove(i + 1);
                        subNumbers.set(i, res);
                        subOps.remove(i);
                        i--; 
                    }
                }
            }
            answer = Math.max(answer, Math.abs(subNumbers.get(0)));
        }
        
        return answer;
    }

    private long calculate(long n1, long n2, String op) {
        switch (op) {
            case "+": return n1 + n2;
            case "-": return n1 - n2;
            case "*": return n1 * n2;
        }
        return 0;
    }
}
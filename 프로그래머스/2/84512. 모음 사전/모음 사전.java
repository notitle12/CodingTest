import java.util.*;

class Solution {
    private List<String> list = new ArrayList<>();
    private String[] vowels = {"A", "E", "I", "O", "U"};

    public int solution(String word) {
        generate("", 0);
        return list.indexOf(word);
    }

    private void generate(String current, int length) {
        list.add(current);
        if (length == 5) return;

        for (int i = 0; i < 5; i++) {
            generate(current + vowels[i], length + 1);
        }
    }
}